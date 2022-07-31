package com.goalpioneers.modules.formatter.flatfiles.templates;


import com.goalpioneers.modules.formatter.templates.IOFormatterWriter;
import com.goalpioneers.modules.formatter.flatfiles.templates.elements.FlatFilesMatrice;


/**
 * 
 */
public abstract class FlatFilesWriter 
	extends IOFormatterWriter
{
	/**
	 * 
	 */
	public FlatFilesWriter()
	{
		this.setMatrice( 
			new FlatFilesMatrice()
		);
	}
	
	
	// Variables
	private FlatFilesMatrice matrice = null;
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public FlatFilesMatrice getMatrice() 
	{
		return this.matrice;
	}
	
	/**
	 * 
	 * @param matrice
	 */
	public void setMatrice( FlatFilesMatrice matrice ) 
	{
		this.matrice = matrice;
	}
}