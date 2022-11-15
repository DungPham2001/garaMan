<%-- 
    Document   : dichvuchitiet
    Created on : Nov 11, 2022, 8:22:16 AM
    Author     : Dell Precision 7510
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />

        <title>GaraMan</title>

        <!-- GOOGLE FONTS -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500|Poppins:400,500,600,700|Roboto:400,500" rel="stylesheet"/>
        <link href="https://cdn.materialdesignicons.com/3.0.39/css/materialdesignicons.min.css" rel="stylesheet" />

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.25/css/dataTables.bootstrap5.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>

        <!-- PLUGINS CSS STYLE -->
        <link href="assets1/plugins/toaster/toastr.min.css" rel="stylesheet" />
        <link href="assets1/plugins/nprogress/nprogress.css" rel="stylesheet" />
        <link href="assets1/plugins/flag-icons/css/flag-icon.min.css" rel="stylesheet"/>
        <link href="assets1/plugins/jvectormap/jquery-jvectormap-2.0.3.css" rel="stylesheet" />
        <link href="assets1/plugins/ladda/ladda.min.css" rel="stylesheet" />
        <link href="assets1/plugins/select2/css/select2.min.css" rel="stylesheet" />
        <link href="assets1/plugins/daterangepicker/daterangepicker.css" rel="stylesheet" />
        

        <!-- SLEEK CSS -->
        <link id="sleek-css" rel="stylesheet" href="assets/css/sleek.css" />



        <!-- FAVICON -->
        <link href="assets1/img/favicon.png" rel="shortcut icon" />

        <!--
          HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries
        -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
        <script src="assets1/plugins/nprogress/nprogress.js"></script>
        
    </head>


    <body class="sidebar-fixed sidebar-dark header-light header-fixed" id="body">
        <script>
            NProgress.configure({showSpinner: false});
            NProgress.start();
        </script>

        <div class="mobile-sticky-body-overlay"></div>

        <div class="wrapper">

            <!--
        ====================================
        ——— LEFT SIDEBAR WITH FOOTER
        =====================================
            -->
            <aside class="left-sidebar bg-sidebar">
                <div id="sidebar" class="sidebar sidebar-with-footer">
                    <!-- Aplication Brand -->
                    <div class="app-brand">
                        <a href="home-manager.html">
                            <svg
                                class="brand-icon"
                                xmlns="http://www.w3.org/2000/svg"
                                preserveAspectRatio="xMidYMid"
                                width="30"
                                height="33"
                                viewBox="0 0 30 33"
                                >
                            <g fill="none" fill-rule="evenodd">
                            <path
                                class="logo-fill-blue"
                                fill="#7DBCFF"
                                d="M0 4v25l8 4V0zM22 4v25l8 4V0z"
                                />
                            <path class="logo-fill-white" fill="#FFF" d="M11 4v25l8 4V0z" />
                            </g>
                            </svg>
                            <span class="brand-name">GaraMan Dashboard</span>
                        </a>
                    </div>
                    <!-- begin sidebar scrollbar -->
                    <div class="sidebar-scrollbar">

                        <!-- sidebar menu -->
                        <ul class="nav sidebar-inner" id="sidebar-menu">



                            <li  class="has-sub active expand" >
                                <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse" data-target="#dashboard"
                                   aria-expanded="false" aria-controls="dashboard">
                                    <i class="mdi mdi-view-dashboard-outline"></i>
                                    <span class="nav-text">Quản lí thông tin</span> <b class="caret"></b>
                                </a>
                                <ul  class="collapse show"  id="dashboard"
                                     data-parent="#sidebar-menu">
                                    <div class="sub-menu">



                                        <li  class="active" >
                                            <a class="sidenav-item-link" href="index.html">
                                                <span class="nav-text">Dịch vụ</span>

                                            </a>
                                        </li>






                                        <li >
                                            <a class="sidenav-item-link" href="analytics.html">
                                                <span class="nav-text">Phụ tùng</span>

                                                <!--                                                <span class="badge badge-success">new</span>-->

                                            </a>
                                        </li>




                                    </div>
                                </ul>
                            </li>

                            <li  class="has-sub" >
                                <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse" data-target="#ui-elements"
                                   aria-expanded="false" aria-controls="ui-elements">
                                    <i class="mdi mdi-folder-multiple-outline"></i>
                                    <span class="nav-text">Thống kê</span> <b class="caret"></b>
                                </a>
                                <ul  class="collapse"  id="ui-elements"
                                     data-parent="#sidebar-menu">
                                    <div class="sub-menu">


                                        <li  class="has-sub" >
                                            <a href="tkdichvufrm.html">
                                                <span class="nav-text">Dịch vụ</span>
                                            </a>
                                        </li>




                                        <li  class="has-sub" >
                                            <a href="tkphutungfrm.html">
                                                <span class="nav-text">Phụ tùng</span>
                                            </a>
                                        </li>




                                        <li  class="has-sub" >
                                            <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse" data-target="#forms"
                                               aria-expanded="false" aria-controls="forms">
                                                <span class="nav-text">Khách hàng</span>
                                            </a>
                                        </li>




                                        <li  class="has-sub" >
                                            <a class="sidenav-item-link" href="javascript:void(0)" data-toggle="collapse" data-target="#maps"
                                               aria-expanded="false" aria-controls="maps">
                                                <span class="nav-text">Nhà cung cấp</span>
                                            </a>
                                        </li>



                                    </div>
                                </ul>
                            </li>

                        </ul>

                    </div>

                    <hr class="separator" />

                    <div class="sidebar-footer">
                    </div>
                </div>
            </aside>



            <div class="page-wrapper">
                <!-- Header -->
                <header class="main-header " id="header">
                    <nav class="navbar navbar-static-top navbar-expand-lg">
                        <!-- Sidebar toggle button -->
                        <button id="sidebar-toggler" class="sidebar-toggle">
                            <span class="sr-only">Toggle navigation</span>
                        </button>
                        <!-- search form -->
                        <div class="search-form d-none d-lg-inline-block">
                            <div class="input-group">
                                <button type="button" name="search" id="search-btn" class="btn btn-flat">
                                    <i class="mdi mdi-magnify"></i>
                                </button>
                                <input type="text" name="query" id="search-input" class="form-control" placeholder="Search"
                                       autofocus autocomplete="off" />
                            </div>
                            <div id="search-results-container">
                                <ul id="search-results"></ul>
                            </div>
                        </div>

                        <div class="navbar-right ">
                            <ul class="nav navbar-nav">
                                <!-- User Account -->
                                <li class="dropdown nav-user ms-4">
                                    <a class="nav-link nav-user-img" href="#" id="navbarDropdownMenuLink2" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="margin-left: 84px">
                                        <img src="https://i.pinimg.com/280x280_RS/2e/45/66/2e4566fd829bcf9eb11ccdb5f252b02f.jpg" alt="" class="user-avatar-md rounded-circle" width="50px" height="50px">
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-right nav-user-dropdown text-center" aria-labelledby="navbarDropdownMenuLink2">
                                        <div class="nav-user-info">
                                            <span class="status"></span><span class="ml-2">${name}</span>
                                        </div>
                                        <a class="dropdown-item" href="#"><i class="fas fa-user mr-2"></i>Account</a>
                                        <a class="dropdown-item" href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-gear" viewBox="0 0 16 16">
                                            <path d="M8 4.754a3.246 3.246 0 1 0 0 6.492 3.246 3.246 0 0 0 0-6.492zM5.754 8a2.246 2.246 0 1 1 4.492 0 2.246 2.246 0 0 1-4.492 0z"/>
                                            <path d="M9.796 1.343c-.527-1.79-3.065-1.79-3.592 0l-.094.319a.873.873 0 0 1-1.255.52l-.292-.16c-1.64-.892-3.433.902-2.54 2.541l.159.292a.873.873 0 0 1-.52 1.255l-.319.094c-1.79.527-1.79 3.065 0 3.592l.319.094a.873.873 0 0 1 .52 1.255l-.16.292c-.892 1.64.901 3.434 2.541 2.54l.292-.159a.873.873 0 0 1 1.255.52l.094.319c.527 1.79 3.065 1.79 3.592 0l.094-.319a.873.873 0 0 1 1.255-.52l.292.16c1.64.893 3.434-.902 2.54-2.541l-.159-.292a.873.873 0 0 1 .52-1.255l.319-.094c1.79-.527 1.79-3.065 0-3.592l-.319-.094a.873.873 0 0 1-.52-1.255l.16-.292c.893-1.64-.902-3.433-2.541-2.54l-.292.159a.873.873 0 0 1-1.255-.52l-.094-.319zm-2.633.283c.246-.835 1.428-.835 1.674 0l.094.319a1.873 1.873 0 0 0 2.693 1.115l.291-.16c.764-.415 1.6.42 1.184 1.185l-.159.292a1.873 1.873 0 0 0 1.116 2.692l.318.094c.835.246.835 1.428 0 1.674l-.319.094a1.873 1.873 0 0 0-1.115 2.693l.16.291c.415.764-.42 1.6-1.185 1.184l-.291-.159a1.873 1.873 0 0 0-2.693 1.116l-.094.318c-.246.835-1.428.835-1.674 0l-.094-.319a1.873 1.873 0 0 0-2.692-1.115l-.292.16c-.764.415-1.6-.42-1.184-1.185l.159-.291A1.873 1.873 0 0 0 1.945 8.93l-.319-.094c-.835-.246-.835-1.428 0-1.674l.319-.094A1.873 1.873 0 0 0 3.06 4.377l-.16-.292c-.415-.764.42-1.6 1.185-1.184l.292.159a1.873 1.873 0 0 0 2.692-1.115l.094-.319z"/>
                                            </svg>
                                            Setting
                                        </a>
                                        <a class="dropdown-item" href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-box-arrow-right" viewBox="0 0 16 16">
                                            <path fill-rule="evenodd" d="M10 12.5a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-9a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v2a.5.5 0 0 0 1 0v-2A1.5 1.5 0 0 0 9.5 2h-8A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-2a.5.5 0 0 0-1 0v2z"/>
                                            <path fill-rule="evenodd" d="M15.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 0 0-.708.708L14.293 7.5H5.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708l3-3z"/>
                                            </svg>
                                            Logout
                                        </a>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </nav>


                </header>
                                        
                <div class="container">
                    <div class="text-center">
                        <h1 style="margin-bottom:50px; margin-top: 20px">Hóa đơn</h1>
                    </div>
                    <div class="row">
                        <div class="well">
                            <div class="row" style="margin-bottom: 50px">
                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <address>
                                        <strong>GaraMan</strong>
                                        <br>
                                        Trần Phú Hà Đông
                                        <br>
                                        <abbr title="Phone">Phone:</abbr> 01234567
                                    </address>
                                    <div>
                                        <p>Nhân viên: Nguyễn Đăng Chương</p>
                                    </div>
                                </div>
                                <div class="col-xs-6 col-sm-6 col-md-6 text-right">
                                    <p>
                                        <em>Date: 14/11/2022</em>
                                    </p>
                                    <p>
                                        <em>Khách hàng: Lê Văn Công</em>
                                    </p>
                                    <p>
                                        <em>Địa chỉ: Trần Phú, Hà Đông</em>
                                    </p>
                                </div>
                            </div>
                            <div class="row">
                                </span>
                                <table class="table table-hover">
                                    <thead>
                                        <tr>
                                            <th>Dịch vụ</th>
                                            <th class="text-center">Số lượng</th>
                                            <th class="text-center">Giá</th>
                                            <th class="text-center">Tổng tiền</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="col-md-6"><em>Bảo dưỡng ô tô</em></h4></td>
                                            <td class="col-md-1" style="text-align: center"> 2 </td>
                                            <td class="col-md-2 text-center">1.300.000 VND</td>
                                            <td class="col-md-2 text-center">2.600.000 VND</td>
                                        </tr>
                                        <tr>
                                            <td class="col-md-6"><em>Bảo hiểm ô tô</em></h4></td>
                                            <td class="col-md-1" style="text-align: center"> 1 </td>
                                            <td class="col-md-2 text-center">2.000.000 VND</td>
                                            <td class="col-md-2 text-center">2.000.000 VND</td>
                                        </tr>
                                        
                                        <tr>
                                            <td></td>
                                            <td></td>
                                            <td class="text-right">
                                            <p>
                                                <strong>Tổng tiền:</strong>
                                            </p>
                                            </td>
                                            <td>
                                            <p>
                                                <strong>4.600.000 VND</strong>
                                            </p>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                                
                            </div>
                        </div>
                    </div>
                    
                    <div class="row" style="margin-top: 50px">
                        <div class="well">
                            <div class="row">
                                
                                </span>
                                <table class="table table-hover">
                                    <thead>
                                        <tr>
                                            <th>Phụ tùng</th>
                                            <th class="text-center">Số lượng</th>
                                            <th class="text-center">Giá</th>
                                            <th class="text-center">Tổng tiền</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="col-md-6"><em>Lốp xe</em></h4></td>
                                            <td class="col-md-1" style="text-align: center"> 2 </td>
                                            <td class="col-md-2 text-center">300.000 VND</td>
                                            <td class="col-md-2 text-center">600.000 VND</td>
                                        </tr>
                                        <tr>
                                            <td class="col-md-6"><em>Vô lăng</em></h4></td>
                                            <td class="col-md-1" style="text-align: center"> 2 </td>
                                            <td class="col-md-2 text-center">300.000 VND</td>
                                            <td class="col-md-2 text-center">600.000 VND</td>
                                        </tr>
                                        
                                        <tr>
                                            <td></td>
                                            <td></td>
                                            <td class="text-right">
                                            <p>
                                                <strong>Tổng tiền:</strong>
                                            </p>
                                            </td>
                                            <td>
                                            <p>
                                                <strong>1.200.000 VND</strong>
                                            </p>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                                
                            </div>
                        </div>
                    </div>
                    <div style="margin-top: 40px;margin-bottom: 30px; border: 1px solid red">
                        <h1 class="text-danger text-center">Tổng tiền: 5.800.000 VND</h1>
                    </div>
                </div>
                <footer class="footer mt-auto">
                    <script>
                        var d = new Date();
                        var year = d.getFullYear();
                        document.getElementById("copy-year").innerHTML = year;
                    </script>
                </footer>

            </div>
        </div>


        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDCn8TFXGg17HAUcNpkwtxxyT9Io9B_NcM" defer></script>
        <script src="assets1/plugins/jquery/jquery.min.js"></script>
        <script src="assets1/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assets1/plugins/toaster/toastr.min.js"></script>
        <script src="assets1/plugins/slimscrollbar/jquery.slimscroll.min.js"></script>
        <script src="assets1/plugins/charts/Chart.min.js"></script>
        <script src="assets1/plugins/ladda/spin.min.js"></script>
        <script src="assets1/plugins/ladda/ladda.min.js"></script>
        <script src="assets1/plugins/jquery-mask-input/jquery.mask.min.js"></script>
        <script src="assets1/plugins/select2/js/select2.min.js"></script>
        <script src="assets1/plugins/jvectormap/jquery-jvectormap-2.0.3.min.js"></script>
        <script src="assets1/plugins/jvectormap/jquery-jvectormap-world-mill.js"></script>
        <script src="assets1/plugins/daterangepicker/moment.min.js"></script>
        <script src="assets1/plugins/daterangepicker/daterangepicker.js"></script>
        <script src="assets1/plugins/jekyll-search.min.js"></script>
        <script src="assets1/js/sleek.js"></script>
        <script src="assets1/js/chart.js"></script>
        <script src="assets1/js/date-range.js"></script>
        <script src="assets1/js/map.js"></script>
        <script src="assets1/js/custom.js"></script>


        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.25/js/dataTables.bootstrap5.min.js"></script>
        <script src="./main.js"></script>

        <script>
                        function showInfo(id, ten, gia, moTa) {
                            $('#myDV p[name="id"]').text(id)
                            $('#myDV p[name="tenDV"]').text(ten)
                            $('#myDV p[name="giaDV"]').text(gia)
                            $('#myDV p[name="moTa"]').text(moTa)
                            $('#myDV').modal('show')
                        }
        </script>

    </body>
</html>


