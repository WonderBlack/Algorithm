package chap3;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] x = {// Javaのキーワード：アルファベット順
				"abstract",		"assert",		"boolean",		"break",		"byte",
				"case",			"catch",		"char",			"class",		"const",
				"continue",		"default",		"do",			"double",		"else",
				"enum",			"extends",		"final",		"finally",		"float",
				"for",			"goto",			"if",			"implements",	"import",
				"instanceof",	"int",			"interface",	"long",			"native",
				"new",			"package",		"private",		"protected",	"public",
				"return",		"short",		"static",		"strictfp",		"super",
				"switch",		"synchronized",	"this",			"throw",		"throws",
				"transient",	"try",			"void",			"volatile",		"while"
		};
		
		System.out.print("何を探しますか：");
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if (idx < 0) {
			System.out.println("そのキーワードは存在しません。");
		} else {
			System.out.println("それはx[" + idx + "]にあります。");
		}
	}

}
