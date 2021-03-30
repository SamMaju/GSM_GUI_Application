<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>MyWebSite</title>
<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
<script language="javascript"> 
function validate(){
	alert("hii hii");
	var name= document.form2.name.value;
	var email= document.form2.email.value;
	var phone= document.form2.phone.value;
	var foodexp= document.form2.foodexp.value;
	var exp= document.frm.form2.value;
	alert(name);
	if(name == ""){
		alert("Please insert the name");
		return false;
	}else if ( email == "" )
    {
        alert ( "Please insert the email " );
        return false;
    }else if (phone == "" )
    {
        alert ( "Please insert the phone" );
        return false;
    }else if (foodexp == "" )
    {
        alert ( "Please insert the foodexp" );
        return false;
    }else if (exp == "" )
    {
        alert ( "Please insert the exp" );
        return false;
    }	
	

}


        function addRow(tableID) { 
  
            var table = document.getElementById(tableID); 
  
           var rowCount = table.rows.length; 
            var row = table.insertRow(rowCount); 
  
            var cell1 = row.insertCell(0); 
            var element1 = document.createElement("input"); 
            element1.type = "checkbox";
            cell1.appendChild(element1); 
  
            var cell2 = row.insertCell(1); 
           // cell2.innerHTML = rowCount + 1;
            var element3 = document.createElement("input"); 
            element3.type = "text"; 
           
            cell2.appendChild(element3); 		   
  
            var cell3 = row.insertCell(2); 
            var element2 = document.createElement("input");
            
            element2.type = "text";
            
             //element2.hasOwnProperty("myBox");
            cell3.appendChild(element2); 
  
        } 
function deleteRow(tableID) { 
            try { 
            var table = document.getElementById(tableID); 
            var rowCount = table.rows.length; 

           for(var i=1; i<rowCount; i++) { 
                var row = table.rows[i]; 
                var chkbox = row.cells[0].childNodes[0]; 
                if(null != chkbox && true == chkbox.checked) { 
                    table.deleteRow(i); 
                    rowCount--; 
                    i--; 
                } 
  
            } 
            }catch(e) { 
                alert(e); 
            } 




        } 
  
    </script> 

<!--9739453494-->
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
      
</div> 
</div> 

        <div id="main_container">               
           <form id="form2" action="UserInformation"method="post"  onsubmit="javascript:return validate();">	
		
			<h3><span>HELP YOURSELF TO GET THE SAVING PORTFOLIO</span></h3>
		
			<fieldset><legend>Contact form</legend>
				<p class="first">
					<label for="name">Name</label>
					<input type="text" name="name" id="name" size="30" />
				</p>
				<p>
					<label for="email">Email</label>
					<input type="text" name="email" id="email" size="30" />
				</p>
				<p>
					<label for="web">Phone Number</label>
					<input type="text" name="web" id="web" size="30" />
				</p>																					
				<p>
					<label for="Salary">Salary</label>
					<input type="text" name="salary" id="web" size="30" />
				</p>
                <p>
					<label for="exp">Food Expenses</label>
					<input type="text" name="exp" id="web" size="30" />
				</p>
                <p>
					<label for="exp">Other Expenses</label>
														
   <table><tr>
<td>
<input type="button" value="Add personalized expenditure" onclick="addRow('dataTable')" /> </td><td>
  
    <input type="button" value="Delete personalization" onclick="deleteRow('dataTable')" /> </td>
  

</tr></table>
  </p>
    <table id="dataTable"> 
        <tr> 
            <td width="10%"><input type='checkbox' name='checkall' onclick="checkedAll('dataTable')"/></td>
            <td> <label>Expenditure Type</label>
            </td>
            <td> <label>Expenditure(Rs.)</label>
            </td> 
        </tr> 

        <tr> 
            <td width="10%"><input type="checkbox" name="chk"/></td> 
            <td> <input type="text"  /></td>
            <td> <input type="text" name="myBox"/> </td> 
        </tr> 
    </table> 				
<p class="submit" onkeypress="validate();">
								<button type="submit">Send</button>
							</p>
							

<span id="fooBar">&nbsp;</span>
			</fieldset>					
						
		</form>	
		
		
		
						<div class="clear"></div>
			</div>

			<div class="footer">
				<div class="copyright">
					<a href="http://csstemplatesmarket.com/" target="_blank">Free
						CSS Templates</a> | <a href="http://csstemplatesmarket.com/"
						target="_blank">by CssTemplatesMarket</a>
				</div>

				<div class="footer_links">
					<a class="current" href="index.html" title="">Home</a> <a href="#"
						title="">About Company</a> <a href="#" title="">Projects</a> <a
						href="#" title="">Clients</a> <a href="#" title="">Testimonials</a>
					<a href="contact.html" title="">Contact</a>
				</div>
			</div>

         </div> 
        
        
        <!---------------------------------end of middle banner-------------------------------->
        
        
     
</body>
</html>