<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
             <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des cours</title>
    </head>
    <body>
    <form method="POST" action="GestionServlet">
    Cr�ation d'un cours: 
    <input type="text" name=theme />
    <input type="text" name=heure /> 
    <input type="submit" value="Ajouter" />
    </form>
    </body>
</html>