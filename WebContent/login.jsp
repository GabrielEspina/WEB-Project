


<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

    <meta charset="utf-8">
    <title></title>
  </head>
    <body>

      <div class="container">

          <div style="margin: auto; ">
            <span style="font-size: 200px; color: Dodgerblue; width:100%; margin: auto;">
              <i class="fas fa-user"></i>
            </span>
          </div>
         
        <form action="demo" method="get">
          
          <div class="form-group">
            <label for="InputUsuario">Usuario</label>
            <input name="name" type="test" class="form-control" id="InputUsuario" aria-describedby="usuarioHelp" placeholder="Ingrese Usuario" required>
          </div>
          <div class="form-group">
            <label for="InputPassword">Password</label>
            <input name="password"type="password" class="form-control" id="InputPassword" placeholder="Ingrese Password" required>
            <label style = "color: red;"> <%= request.getAttribute("error") %> </label>
          </div>
<!-- <div class="form-group form-check">
  <input type="checkbox" class="form-check-input" id="Check">
  <label class="form-check-label" for="Check">Check me out</label>
</div> -->
          <button type="submit" class="btn btn-primary" style="width: 100%;">Login</button>
      </form>
    </div>
  </body>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</html>