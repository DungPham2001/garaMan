x`<%-- 
    Document   : tkdichvu
    Created on : Nov 11, 2022, 8:24:06 AM
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
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

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
                                <li class="dropdown user-menu">
                                    <a href="login.html"> <i class="mdi mdi-logout"></i> Log Out </a>
                                </li>
                            </ul>
                        </div>
                    </nav>


                </header>


                <div class="content-wrapper">
                    <h1 style="color: black" class="mb-3 text-center">Thống kê dịch vụ</h1>
                    <div class="btn" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample" style="background-color: white">
                        <p class="text-left">Chọn thời gian thống kê</p>
                    </div>
                    <div class="collapse" id="collapseExample">
                        <div class="form-row" style="background-color: white">
                            <form class="ms-5" action="searchDV">
                                <div class="d-flex">
                                    <div style="margin-right: 135px">
                                        <label for="ngayBatDau" class="form-label">Ngày bắt đầu</label>
                                        <input type="date" class="form-control" id="ngayBatDau" name="ngayBatDau" style="width: 514px">
                                    </div>
                                    <div>
                                        <label for="ngayBatDau" class="form-label">Ngày kết thúc</label>
                                        <input type="date" class="form-control" id="ngayBatDau" name="ngayBatDau" style="width: 514px">
                                    </div>
                                </div>
                                <button type="submit" class="btn btn-primary float-right mt-3">Search</button>
                            </form>
                        </div>
                    </div>
                    <br>
                    <br>
                    <div class="container mt-3 justify-content-center">
                        <table id="example" class="table table-bordered table-center table-hover" cellspacing="0" width="100%">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th >Tên dịch vụ</th>
                                    <th>Giá</th>
                                    <th>Số lượng</th>
                                    <th>Xem chi tiết</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>1</td>
                                    <td>Bảo dưỡng</td>
                                    <td>500$</td>
                                    <td>10</td>
                                    <td>
                                        <a href="dichvuchitiet.jsp" class="btn btn-primary">Xem</a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
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

    </body>
</html>

