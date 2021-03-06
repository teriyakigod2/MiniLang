package tests;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import flang.Interpreter;
import flang.utils.Assertion;

class Test1 {

	@Test
	void test() {
		try {
			String program = new String(
					Files.readAllBytes(Paths.get("samples//fib.txt")),
					StandardCharsets.UTF_8);
			Interpreter lang = new Interpreter();
			lang.registerFunction("assert", new Assertion());
			lang.eval(program);
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	void test1() {
		try {
			String program = new String(
					Files.readAllBytes(Paths.get("samples//sort.txt")),
					StandardCharsets.UTF_8);
			Interpreter lang = new Interpreter();
			lang.registerFunction("assert", new Assertion());
			lang.eval(program);
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	void test2() {
		try {
			String program = new String(
					Files.readAllBytes(Paths.get("samples//list.txt")),
					StandardCharsets.UTF_8);
			Interpreter lang = new Interpreter();
			lang.registerFunction("assert", new Assertion());
			lang.eval(program);
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	void test3() {
		try {
			String program = new String(
					Files.readAllBytes(Paths.get("samples//euclid.txt")),
					StandardCharsets.UTF_8);
			Interpreter lang = new Interpreter();
			lang.registerFunction("assert", new Assertion());
			lang.eval(program);
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	void test4() {
		try {
			String program = new String(
					Files.readAllBytes(Paths.get("samples//ftest2.txt")),
					StandardCharsets.UTF_8);
			Interpreter lang = new Interpreter();
			lang.registerFunction("assert", new Assertion());
			lang.eval(program);
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	void test5() {
		try {
			String program = new String(
					Files.readAllBytes(Paths.get("samples//ftest.txt")),
					StandardCharsets.UTF_8);
			Interpreter lang = new Interpreter();
			lang.registerFunction("assert", new Assertion());
			lang.eval(program);
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
			fail();
		}
	}
}
