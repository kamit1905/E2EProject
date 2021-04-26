package Academy;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Read_PDF_File {
	
	@Test
	public void readPDF() throws IOException {
		
		URL url = new URL("file:///C:/Users/Amit/Downloads/Selenium%20QA.pdf");
		InputStream is = url.openStream();
		BufferedInputStream fileparse = new BufferedInputStream(is);
		PDDocument document=null;
		document = PDDocument.load(fileparse);
		String text=new PDFTextStripper().getText(document);
		System.out.println(text);
		Assert.assertTrue(text.contains("What is Automation Testing?"));
		
		Set<String> st=new HashSet<String>();
		st.add("2000");
		st.add("300");
		
		List<String> li = new ArrayList<String>(st);
		System.out.println("li "+li);
		
	}

}
