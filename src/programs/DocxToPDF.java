package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.crypto.Data;

import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
 
public class DocxToPDF {
 //C:/Users/Nirakar/Desktop/datapro/datapro_salaryslip.docx
   
    	public static void main( String[] args )
        {
            long startTime = System.currentTimeMillis();

            try
            {
            	InputStream is = new FileInputStream(new File(
                        "C:/Users/Nirakar/Desktop/datapro/datapro_salaryslip.docx"));
                // 1) Load docx with POI XWPFDocument
                XWPFDocument document = new XWPFDocument(is);

                // 2) Convert POI XWPFDocument 2 PDF with iText
                File outFile = new File( "C:/Users/Nirakar/Desktop/datapro/datapro_salaryslipnew1.pdf" );
                outFile.getParentFile().mkdirs();

                OutputStream out = new FileOutputStream( outFile );
                PdfOptions options = null;// PDFViaITextOptions.create().fontEncoding( "windows-1250" );
                PdfConverter.getInstance().convert( document, out, options );
            }
            catch ( Throwable e )
            {
                e.printStackTrace();
            }

            System.out.println( "Generate DocxStructures.pdf with " + ( System.currentTimeMillis() - startTime ) + " ms." );
        }
}