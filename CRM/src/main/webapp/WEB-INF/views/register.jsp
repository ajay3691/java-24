<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
                integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
                crossorigin="anonymous">

</head>

<body>
    <nav>
        <a href="#">Customer Registration</a>
    </nav>
    <div class="container">
        <div class="row">
            <div class="col-md-5">
                <div class="card">
                    <div class="card-header">Registraion Page</div>
                    <div class="card-body">
                        <form:form action="save" method="post" modelAttribute="custBean">
                            <div class="form-group">
                                <form:input class="form-controll" type="text" path="name" placeholder="User Name" />
                            </div>
                            <div class="form-group">
                                <form:input class="form-controll" type="text" path="email" placeholder="Email" />
                            </div>
                            <div class="form-group">
                                <form:input class="form-controll" type="text" path="password" placeholder="Password" />
                            </div>
                            <div class="form-group">
                                <form:input class="form-controll" type="text" path="mobile" placeholder="mobile" />
                            </div>
                            <div class="form-group">
                                <form:input type="submit" value="Registration" />
                            </div>

                            </form>
                    </div>
                </div>
            </div>
        </div>
    </div>


</body>

</html>