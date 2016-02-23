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
public class Document
{
    private String title;
    private String author;
    private String body;
    private int version;
    
    public Document(String title, String author)
    {
        this(title, author, "");
        
        this.version = 0;
    }
    
    public Document(String title, String author, String body)
    {
        this.title = title;
        this.author = author;
        this.body = body;
        
        this.version = 1;
    }
    
    public void setTitle(String val)
    {
        this.title = val;
        this.version++;
    }
    
    public void setAuthor(String val)
    {
        this.author = val;
    }
    
    public void setBody(String val)
    {
        this.body = val;
        this.version++;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public String getAuthor()
    {
        return this.author;
    }
    
    public String getBody()
    {
        return this.body;
    }
    
    public int getVersion()
    {
        return this.version;
    }
    
}
