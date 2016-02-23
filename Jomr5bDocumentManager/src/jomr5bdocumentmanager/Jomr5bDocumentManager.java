/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jomr5bdocumentmanager;

/**
 *
 * @author Jared
 */
public class Jomr5bDocumentManager
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Document document1 = new Document("Another Life", "Sally Smith");
        document1.setBody("The grass is always greener on the other side.");
        
        Document document2 = new Document("Final Word", "Karen Jones", "We should plan for the worst and hope for the best.");
        document2.setTitle("Final Words");
        
        PrintInfo("document1", document1);
        System.out.println();
        PrintInfo("document2", document2);
    }
    
    public static void PrintInfo(String docVarName, Document doc)
    {
        System.out.println(docVarName + ":");
        System.out.println("title: " + doc.getTitle());
        System.out.println("author: " + doc.getAuthor());
        System.out.println("body: " + doc.getBody());
        System.out.println("version: " + doc.getVersion());
    }
    
}
