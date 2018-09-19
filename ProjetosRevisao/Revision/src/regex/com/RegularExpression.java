package regex.com;

import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		boolean b = "Java".matches("Java");
		b = "Java".matches("java");
		b = "Java".matches("(?i)java");
		b = "Java".matches("(?im)java");
		b = "@".matches(".");
		b = "2".matches("\\d");
		b = "A".matches("\\W");
		b = " ".matches("\\s");
		b = "72000-000".matches("\\d\\d\\d\\d\\d-\\d\\d\\d");
		b = "72000-000".matches("\\d{5}-\\d{3}");
		b = "26/03/2022".matches("\\d{2}/\\d{2}/\\d{4}");
		b = "Pier21".matches("^Pier.*");
		b = "Pier21".matches(".*21$");
		b = "tem texto aqui".matches(".*texto.*");
		b = "tem texto aqui".matches("^tem.*aqui$");
		b = "SIM".matches("SIM|NAO");
		b =  "sim".matches("[a-z]");
		b =  "SIM".matches("[A-Z]");
		b =  "Sim".matches("[A-Z][a-z]{2}");
		b =  "True".matches("[tT]rue");
		b =  "rh@gmail.com.br".matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
//		String Doce = "Qual o Doce mais doce do que dOce";
//		Pattern.compile("(?i)doce");
		
		System.out.println(b);

	}

}
