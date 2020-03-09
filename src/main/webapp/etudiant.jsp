<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
             <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des étudiants</title>
    </head>
    <body>
    <form method="POST" action="GestionServlet">
    Création d'un étudiant: 
    <input type="text" name="nom" />
    <input type="text" name="prenom" /> 
    <input type="text" name="email" /> 
    <input type="text" name="adresse" />
    <input type="text" name="telephone" />
    <input type="text" name="dateNaissance" />   
    <input type="submit" value="Ajouter" />
    </form>
    </body>
</html>