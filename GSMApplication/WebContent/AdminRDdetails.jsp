<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="org.apache.catalina.connector.Request"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>MyWebSite</title>
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<script type="text/javascript" src="js/jquery.core.js"></script>
<script type="text/javascript" src="js/jquery.superfish.js"></script>
<script type="text/javascript" src="js/jquery.jcarousel.pack.js"></script>
<script type="text/javascript" src="js/jquery.easing.js"></script>
<script type="text/javascript" src="js/jquery.scripts.js"></script>

</head>

<body>
<div id="wrap">
    <div class="top_corner">  
    <div id="main_container">
    
        <div id="header">
            <div id="logo"><a href="index.html"><img src="images/logo.gif" alt="" title="" border="0" /></a></div>
			<div id="logo"><a href="index.html"><img src="images/logo.gif" alt="" title="" border="0" /></a></div>
			<div id="logo"><a href="index.html"><img src="images/logo.gif" alt="" title="" border="0" /></a></div>
</div>
	<div id="mmenu">
      <li><a href="#########">Main</a></li>
    <li>
<a href=" ######### ">Bank Saving Categories</a>
<ul>
<li><a href=" ######### ">FD</a></li>
<li><a href=" ######### ">RD</a></li>
<li><a href=" ######### ">Savings Account</a></li>
</ul>
</li>
<li><a href=" ######### ">Mutual Fund</a></li>
<li><a href=" ######### ">Financial Instruments</a></li>
<li><a href=" ######### ">Contact</a></li>
</div>  
        </div>

        <div id="main_container">

        <div class="middle_banner_custom">
		<B>RD BANK DETAIL</B>
		<div class="clear"></div>
		<div class="clear"></div>
		<hr color=black height=20></hr>
<table id="background-image" summary="Meeting Results">
    <thead>
    
    	<tr>
        	<th scope="col">BANK NAME</th>
            <th scope="col">INTEREST RATE</th>
            <th scope="col">NO. OF MONTHS</th>
            <th scope="col">UPDATED ON </th>
			<th scope="col">UPDATED BY</th>
		</tr>
    </thead>
    <tfoot>
    	<tr>
        	<td colspan="4">* Interest rate is as per data taken on Dec'12</td>
        </tr>
    </tfoot>
    <tbody>
    <% try{
    ArrayList<String> name =(ArrayList<String>)request.getAttribute("BankName");
    ArrayList<Integer> interest=(ArrayList<Integer>)request.getAttribute("InterestRate");
    ArrayList<Integer> months =(ArrayList<Integer>)request.getAttribute("Months");
    ArrayList<String> updatedOn =(ArrayList<String>)request.getAttribute("UpdatedOn");
    ArrayList<String> updatedBy =(ArrayList<String>)request.getAttribute("UpdatedBy");
    
    
    int count=name.size();
    
    
    for(int i=0;i<count;i++){
    %>
    	<tr align="center">
        	<td width="20%"><%out.println(""+name.get(i)); %></td>
            <td width="20%" ><%out.println(""+interest.get(i)); %></td>
            <td width="20%" ><%out.println(""+months.get(i)); %></td>
            <td width="20%" ><%out.println(""+updatedOn.get(i)); %></td>
			<td width="20%" ><%out.println(""+updatedBy.get(i)); %></td>
	</tr>
        <%}
    
    }
    catch(Exception e){}%>
    </tbody>
</table>

   
               
           

        </div>
          
        
        
        </div><!---------------------------------end of middle banner-------------------------------->
        
        
        <div class="center_content">
        
        
         
                        
        </div>
            <div class="left_block_wide">
                <form id="myForm" action="RD_AdminManageFetchData" method="post">
                <table id="background-image" summary="Meeting Results">
    <thead>

    	<tr>
    	    <th scope="col">BANK ID</th>
        	<th scope="col">BANK NAME</th>
            <th scope="col">INTEREST RATE</th>
            <th scope="col">No.OF MONTHS</th>
            <th scope="col">UPDATED ON </th>
			<th scope="col">UPDATED BY</th>
		</tr>
    </thead>
        <tbody>
    	<tr align="center">
    	   <td width="20%"><input type="text" name="BankId" id="Bank" size="10"/></td>
        	<td width="20%"><input type="text" name="Bank" id="Bank" size="10"/></td>
            <td width="20%" ><input type="text" name="Interest" id="Interest" size="10"/></td>
            <td width="20%" ><input type="text" name="Month" id="Month" size="10"/></td>
            <td width="20%" ><input type="text" name="UpdateDate" id="UpdateDate" size="10"/></td>
			<td width="20%" ><input type="text" name="Updatename" id="Updatename" size="10"/></td>
					
			
	</tr>
        
    </tbody>
</table>
<input name="Input" type="submit" value="submit" />
		</form>
            

            
            </div>
			
           
        
        
   
        
        <div class="clear"></div>
        </div>
        
        <div class="footer">
        	<div class="copyright"><a href="http://csstemplatesmarket.com/" target="_blank">Free CSS Templates</a> | <a href="http://csstemplatesmarket.com/" target="_blank">by CssTemplatesMarket</a></div>
        
        	<div class="footer_links">
                <a class="current" href="index.html" title="">Home</a>
                <a href="#" title="">About Company</a>
                <a href="#" title="">Projects</a>
                <a href="#" title="">Clients</a>
                <a href="#" title="">Testimonials</a>
                <a href="contact.html" title="">Contact</a>            
            </div>
        </div>
      
      
    
    </div>
</div>
</body>
</html>
