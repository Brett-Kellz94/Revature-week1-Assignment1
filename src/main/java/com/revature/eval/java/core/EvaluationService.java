package com.revature.eval.java.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		   int spaceloc = phrase.indexOf(" ");
		   int hyphloc = phrase.indexOf("-");
		   int loc;
		   String temp = phrase.toUpperCase(); 
		   String acronym="";
		   int i =0;
		   if (hyphloc < spaceloc && hyphloc != -1) {
			   loc = hyphloc;
		   }
		   else {
			   loc = spaceloc;
		   }
		   if (loc == -1) {
			  i++;
		  }
		   
		   
		   while ( loc != -1 || i<=1 ) {
			   
			  acronym = acronym + temp.charAt(0);
			  temp = temp.substring(loc +1);
			  spaceloc = temp.indexOf(" ");
			  hyphloc = temp.indexOf("-");
			  if (hyphloc < spaceloc && hyphloc != -1) {
				   loc = hyphloc;
			   }
			   else {
				   loc = spaceloc;
			   }
			  if (loc == -1) {
			  i++;
			  }
			  }
			return acronym;
	}
	

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			double one = getSideOne();
			double two = getSideTwo();
			double three = getSideThree();
			
			if ( one == two && two == three) {
				return true;
			}
			
			else {
			return false;
			}
		}

		public boolean isIsosceles() {
			// TODO Write an implementation for this method declaration
			double one = getSideOne();
			double two = getSideTwo();
			double three = getSideThree();
			
			if ( (one == two) || 
					 (one == three) ||
					 (two == three)) {
					return true;
				}
			
			else {
			return false;
			}
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration
			double one = getSideOne();
			double two = getSideTwo();
			double three = getSideThree();
			
			if ( one != two && two != three && three != one) {
				return true;
			}
			
			else {
			return false;
			}
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		int score = 0; 
		string = string.toUpperCase();
		for(int i= 0 ; i < string.length(); i++ ) {
			if (string.charAt(i) == 'A' || 
				string.charAt(i) =='E' || 
				string.charAt(i) =='I' || 
				string.charAt(i) =='O' || 
				string.charAt(i) =='U' || 
				string.charAt(i) =='L' || 
				string.charAt(i) =='N' || 
				string.charAt(i) =='R' || 
				string.charAt(i) =='S' || 
				string.charAt(i) =='T' ) {
				
				score+= 1; 
			}
		
		
		
			if (string.charAt(i) == 'D' || 
				string.charAt(i) =='G'  ) {
				
				score+= 2; 
			}
		
		
	
		
			if (string.charAt(i) == 'B' || 
				string.charAt(i) =='C' || 
				string.charAt(i) =='M' || 
				string.charAt(i) =='P' ) {
				
				score+= 3; }
			
			if (string.charAt(i) == 'F' || 
					string.charAt(i) =='H' || 
					string.charAt(i) =='V' || 
					string.charAt(i) =='W' ||
					string.charAt(i) =='Y') {
					
					score+= 4; }
			
			if (string.charAt(i) == 'K' ) {
					
					score+= 5; }
			
			if (string.charAt(i) == 'J' || 
					string.charAt(i) =='X' ) {
					
					score+= 8; }
			if (string.charAt(i) == 'Q' || 
					string.charAt(i) =='Z') {
					
					score+= 10; }
		}
		
		return score;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
	   
		//int ccindex = string.indexOf("1");
		int spaceindex = string.indexOf(" ");
		int i = 0;
		String temp = string;

		
		
			if(temp.charAt(0) == '1' ) {
				temp = temp.substring(1);
				
			}
			
			while(spaceindex != -1) {
				temp = temp.substring(0, spaceindex) + temp.substring(spaceindex+1);
				spaceindex = temp.indexOf(" ");
			}
			
			int dotindex = temp.indexOf(".");
			
			while(dotindex != -1) {
				temp = temp.substring(0, dotindex) + temp.substring(dotindex+1);
				dotindex = temp.indexOf(".");
			}
			
			int dashindex = temp.indexOf("-");
				
			while(dashindex != -1) {
				temp = temp.substring(0, dashindex) + temp.substring(dashindex+1);
				dashindex = temp.indexOf("-");
				}
			
            int leftindex = temp.indexOf("(");
			
			while(leftindex != -1) {
				temp = temp.substring(0, leftindex) + temp.substring(leftindex+1);
				leftindex = temp.indexOf("(");
			}
			
			 int rightindex = temp.indexOf(")");
				
				while(rightindex != -1) {
					temp = temp.substring(0, rightindex) + temp.substring(rightindex+1);
					rightindex = temp.indexOf(")");
				}
		
		
				   if (temp.matches("^[0-9]{10}$")) {
					   return temp;  
				    }
				   
				   else
				   {
					   throw new IllegalArgumentException("Invalid: length greater than 10 digits.");
				   }
				   
					  
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		
		Map<String, Integer> map = new HashMap<>();
		
		String[] splitWords = string.split(" |,\n|,");
		
		for (String words: splitWords) {
			
			String word = words.toLowerCase();
			
			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count +1);
			}
            
			else {
				map.put(word,  1);
			}
			
			
			Set <String> keys = map.keySet();
			TreeSet <String> sortedKeys = new TreeSet <> (keys);
			
			for (String str : sortedKeys) {
				System.out.println("Word = " + str + "count: " + map.get(str));
			}
			
		}
		
		return map;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList = new ArrayList<>();

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			int index = sortedList.indexOf(t);
			
			return 0;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
			int low =0;
			int high = sortedList.size()-1;
			int mid = (low)
			
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {
		// TODO Write an implementation for this method declaration
		
		//String[] vowelArray = new String[]{"A" , "E" , "I", "O", "U", "Y"};
	    //	String[] consonantArray = new String[]{"A" , "E" , "I", "O", "U", "Y"};
        String[] splitWords = string.split(" ");
		String work = "";
		for (String words: splitWords) {
		
		for (int i = 0; i < words.length(); i++){
		
			char currentChar = words.charAt(i);
			
		if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'  ) {
		
		    String ay = "ay";
			words += ay;
			//work = words;
			break;
		}
		
		else {
			String consonates = "";
			
			//int index = string.indexOf("a|e|i|o|u");
			//String firstLetter = string.substring(0,1);
			//String rest = string.substring(1);
			
			consonates += currentChar;
			
			words = words.substring(words.indexOf(consonates) + consonates.length()) + consonates + "ay";
			
		}
		}
		work += words + " "; 
		}
		work.trim();
		return work;
	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		
		String number = String.valueOf(input);
		int power = number.length();
		double armstrong = 0;
		
		for (int i=0 ; i < number.length(); i++) {
			double temp = Math.pow(Double.parseDouble(number.substring(i,i+1)),power);
			armstrong += temp;
		}
		
		if (armstrong == input) {
			return true;
		}
		else {
		return false;
		}

	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		long n = l;
		List<Long> factors = new ArrayList<Long>();
		
		for ( long i = 2L ; i <= n; i++) {
			
			while ( n % i == 0) {
				factors.add((long) i);
				n /= i ;
			}
		}
		

		return factors;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		private int key;
		public String shift;
		public String shift2;

		public RotationalCipher(int key) {
			super();
			this.key = key;
			shift = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
			shift2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
			shift=shift.substring(key, key+26);
			shift2=shift2.substring(key, key+26);
			
		}
		

		public String rotate(String string) {
			// TODO Write an implementation for this method declaration
			System.out.println(shift);
			String alpha = "abcdefghijklmnopqrstuvwxyz";
			String alpha2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String stuff="0123456789'!, .";
			String encrypt="";
			for(int i = 0; i < string.length(); i++) {
				if(alpha2.contains(String.valueOf(string.charAt(i)))) {
					if(stuff.contains(String.valueOf(string.charAt(i)))) {
						encrypt += string.charAt(i);
					}
					else {
						encrypt += shift2.charAt(alpha2.indexOf(string.charAt(i)));
					}
				}
				else {
				if(stuff.contains(String.valueOf(string.charAt(i)))) {
					encrypt += string.charAt(i);
				}
				else {
					encrypt += shift.charAt(alpha.indexOf(string.charAt(i)));
				}
				}
			}

			return encrypt;
		}
	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int l) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        if(l <=0) {
        	throw new IllegalArgumentException("Invalid: N must be greater than 0.");
        }

       for ( int j = 2 ; factors.size() < l; j++) {
     int n = j;
             int end = j;
             temp.clear();
        for ( int i = 2 ; i <= end; i++) {


                        while ( n % i == 0) {

                                        temp.add(i);

                                        n /= i ;
		if (temp.size() > 1) {
				break;}

                        }
		
		} 
		if (temp.size() == 1) {
		factors.add(temp.get(0));
	}

        }

       

	int out = factors.get(factors.size() - 1);

        return out;
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
			String alpha = "abcdefghijklmnopqrstuvwxyz";
			String reverse = "";
			
			int index = string.indexOf(" ");
			String num = "1234567890";
			
			while(index != -1) {
			string = string.substring(0, index) + string.substring(index+1);
			index = string.indexOf(" ");
			}
			
			index = string.indexOf(",");
			
			while(index != -1) {
			string = string.substring(0, index) + string.substring(index+1);
			index = string.indexOf(",");
			}
			
			
			string = string.toLowerCase();
			
			for(int i = 0; i<26; i++) {
				reverse += alpha.charAt(25 - i); 
			}
			
			String encrypt = "";
			
			for(int i = 0; i < string.length(); i++) {
				if ((i) % 5 == 0) {
					encrypt += " ";
				}
					for ( int j = 0; j < 26; j++) {
						if(num.contains(Character.toString(string.charAt(i)))) {
							encrypt += string.charAt(i);
							break;
						}
						else if (string.charAt(i) == alpha.charAt(j)) {
							encrypt += reverse.charAt(j);
							break;
						}
						
					}
				
			}
				
				
			return encrypt;
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			String alpha = "abcdefghijklmnopqrstuvwxyz";
			String reverse = "";
			
			int index = string.indexOf(" ");
			String num = "1234567890";
			
			while(index != -1) {
			string = string.substring(0, index) + string.substring(index+1);
			index = string.indexOf(" ");
			}
			
			string = string.toLowerCase();
			
			for(int i = 0; i<26; i++) {
				reverse += alpha.charAt(25 - i); 
			}
			
			String decode = "";
			
			for(int i = 0; i < string.length(); i++) {
					for ( int j = 0; j < 26; j++) {
						if(num.contains(Character.toString(string.charAt(i)))) {
							decode += string.charAt(i);
							break;
						}
						else if(string.charAt(i) == reverse.charAt(j)) {
							decode += alpha.charAt(j);
							break;
						}
						
					
				}
			}
			return decode;
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
		// TODO Write an implementation for this method declaration
		boolean here = false;
		if (string.matches("^([0-9]{1})-([0-9]{3})-([0-9]{5})-(([0-9]|X){1})$"))
		{
			int index = string.indexOf("-");
			int isbn = 0; 
			
			while(index != -1) {
			string = string.substring(0, index) + string.substring(index+1);
			index = string.indexOf("-");
			}
			
			for(int i=0; i<9; i++) {
			isbn += Integer.parseInt(String.valueOf(string.charAt(i)))*(10-i);
			}
			
			if(string.charAt(9) == 'X' ) {
				isbn += 10;
			}
			else {
			isbn += Integer.parseInt(String.valueOf(string.charAt(9)))*(1);
			}
			
			if(isbn % 11 == 0) {
				here =  true;
			}

			}
		return here;
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public static boolean isPangram(String string) {
		string = string.toLowerCase();
		boolean out = false;
		
		int index = string.indexOf(" ");
		
		while(index != -1) {
		string = string.substring(0, index) + string.substring(index+1);
		index = string.indexOf(" ");
		}
		
		List<Character> Alpha = new ArrayList<Character>(); 
		for(int i=0; i<string.length();i++) {
			if(Alpha.contains(string.charAt(i)) == true) {
				System.out.println("Character already in sentence");
			}
			else {Alpha.add(string.charAt(i));}
		}
		if (Alpha.size() == 26) {
			out = true;
		}
		return out;
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		if(given instanceof LocalDateTime) { 
			return ((LocalDateTime) given).plusSeconds(1000000000);
		} else {
			LocalDate lDate = (LocalDate) given;
			LocalDateTime ldTime = LocalDateTime.of(lDate.getYear(), lDate.getMonth(), lDate.getDayOfMonth(), 0, 0, 0);
			return (Temporal) ldTime.plusSeconds(1000000000);
		}
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		int total = 0;
		List<Integer> holder = new ArrayList<Integer>();
		for (int j = 0; j < set.length; j++) {
			int mult = set[j];
			int k = 0;
			int times = 0;
		while (mult * k < i ) {
			times = mult * k;

			if(holder.contains(times) == true) {
				System.out.println("Already a Multiple");
			}
			else {holder.add(times);}
			
			k++;
		}
		}
		for (int j=0; j < holder.size(); j++) {
			total += holder.get(j);
		}
		return total;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		boolean out = false;
		int total = 0;
		int index = string.indexOf(" ");

		while(index != -1) {
		string = string.substring(0, index)+string.substring(index+1);
		index = string.indexOf(" ");
		}

		if(string.matches("^[0-9]*$"))
		{
			int count = 0;
			for (int i=string.length()-1; i >= 0; i--) {
				count++; 
				if(count % 2 == 0) {
					if(Integer.parseInt(Character.toString(string.charAt(i)))*2 > 9) {
						total+=((Integer.parseInt(Character.toString(string.charAt(i)))*2) -9);
					}
					else {total+=Integer.parseInt(Character.toString(string.charAt(i)))*2;}
				}
				else {
					total+=Integer.parseInt(Character.toString(string.charAt(i)));
				}
			}
			if (total % 10 == 0) {
				out = true;
			}
		}
		return out;
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		string = string.toLowerCase();
		
		int index = string.indexOf("?");
		
		while(index != -1) {
		string = string.substring(0, index);
		index = string.indexOf("?");
		}
		
		String[] words = string.split(" ");
		int out = 0;
		
		if(string.contains("plus")) {
			
			out = Integer.parseInt(words[2]) + Integer.parseInt(words[4]); 
		}
		else if(string.contains("minus")) {
			out = Integer.parseInt(words[2]) - Integer.parseInt(words[4]); 
		}
		else if(string.contains("multiplied")) {
			out = Integer.parseInt(words[2]) * Integer.parseInt(words[5]); 
		}
		else if(string.contains("divided")) {
			out = Integer.parseInt(words[2]) / Integer.parseInt(words[5]); 
		}
		
		
		return out;
	}

}
