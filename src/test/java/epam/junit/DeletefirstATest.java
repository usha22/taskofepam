package epam.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeletefirstATest {
		/* TODO LIST
		 * 1. 1 char : A =>""					success
		 * 2. 2 chars : AB => B		AA => ""  		success
		 * 3. 4 chars : AACD => CD    BACD => BCD  		success
		 * 4. n chars : AABAA => BAA				success
		 * 5. empty chars : "" => ""				success
		 */
		DeleteFirst2A delA;
		@BeforeEach
		void init(){
			delA=new DeleteFirst2A();
		}
		@Test
		void test1char() {
			assertEquals("",delA.delete("A"));
			assertEquals("B",delA.delete("B"));
		}	
		@Test
		void test2char() {
			assertEquals("",delA.delete("AA"));
			assertEquals("B",delA.delete("AB"));
		}
		@Test
		void test4char() {
			assertEquals("CD",delA.delete("AACD"));
			assertEquals("BCD",delA.delete("ABCD"));
			assertEquals("BCD",delA.delete("BACD"));
			assertEquals("BBAA",delA.delete("BBAA"));
		}
		@Test
		void testnchar() {
			assertEquals("BAA",delA.delete("AABAA"));
			assertEquals("BBAA",delA.delete("BABAA"));
			assertEquals("BBAA",delA.delete("ABBAA"));	
		}
		@Test
		void testEmptychar() {
			assertEquals("",delA.delete(""));
		}
	}
