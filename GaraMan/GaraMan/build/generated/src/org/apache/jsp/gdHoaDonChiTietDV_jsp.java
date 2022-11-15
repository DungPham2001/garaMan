package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gdHoaDonChiTietDV_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\n");
      out.write("        <title>GaraMan</title>\n");
      out.write("\n");
      out.write("        <!-- GOOGLE FONTS -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500|Poppins:400,500,600,700|Roboto:400,500\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"https://cdn.materialdesignicons.com/3.0.39/css/materialdesignicons.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.0.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.25/css/dataTables.bootstrap5.min.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- PLUGINS CSS STYLE -->\n");
      out.write("        <link href=\"assets1/plugins/toaster/toastr.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets1/plugins/nprogress/nprogress.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets1/plugins/flag-icons/css/flag-icon.min.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"assets1/plugins/jvectormap/jquery-jvectormap-2.0.3.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets1/plugins/ladda/ladda.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets1/plugins/select2/css/select2.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets1/plugins/daterangepicker/daterangepicker.css\" rel=\"stylesheet\" />\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- SLEEK CSS -->\n");
      out.write("        <link id=\"sleek-css\" rel=\"stylesheet\" href=\"assets/css/sleek.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- FAVICON -->\n");
      out.write("        <link href=\"assets1/img/favicon.png\" rel=\"shortcut icon\" />\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("          HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries\n");
      out.write("        -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <script src=\"assets1/plugins/nprogress/nprogress.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body class=\"sidebar-fixed sidebar-dark header-light header-fixed\" id=\"body\">\n");
      out.write("        <script>\n");
      out.write("            NProgress.configure({showSpinner: false});\n");
      out.write("            NProgress.start();\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <div class=\"mobile-sticky-body-overlay\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!--\n");
      out.write("        ====================================\n");
      out.write("        ——— LEFT SIDEBAR WITH FOOTER\n");
      out.write("        =====================================\n");
      out.write("            -->\n");
      out.write("            <aside class=\"left-sidebar bg-sidebar\">\n");
      out.write("                <div id=\"sidebar\" class=\"sidebar sidebar-with-footer\">\n");
      out.write("                    <!-- Aplication Brand -->\n");
      out.write("                    <div class=\"app-brand\">\n");
      out.write("                        <a href=\"home-manager.html\">\n");
      out.write("                            <svg\n");
      out.write("                                class=\"brand-icon\"\n");
      out.write("                                xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                preserveAspectRatio=\"xMidYMid\"\n");
      out.write("                                width=\"30\"\n");
      out.write("                                height=\"33\"\n");
      out.write("                                viewBox=\"0 0 30 33\"\n");
      out.write("                                >\n");
      out.write("                            <g fill=\"none\" fill-rule=\"evenodd\">\n");
      out.write("                            <path\n");
      out.write("                                class=\"logo-fill-blue\"\n");
      out.write("                                fill=\"#7DBCFF\"\n");
      out.write("                                d=\"M0 4v25l8 4V0zM22 4v25l8 4V0z\"\n");
      out.write("                                />\n");
      out.write("                            <path class=\"logo-fill-white\" fill=\"#FFF\" d=\"M11 4v25l8 4V0z\" />\n");
      out.write("                            </g>\n");
      out.write("                            </svg>\n");
      out.write("                            <span class=\"brand-name\">GaraMan Dashboard</span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- begin sidebar scrollbar -->\n");
      out.write("                    <div class=\"sidebar-scrollbar\">\n");
      out.write("\n");
      out.write("                        <!-- sidebar menu -->\n");
      out.write("                        <ul class=\"nav sidebar-inner\" id=\"sidebar-menu\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li  class=\"has-sub active expand\" >\n");
      out.write("                                <a class=\"sidenav-item-link\" href=\"javascript:void(0)\" data-toggle=\"collapse\" data-target=\"#dashboard\"\n");
      out.write("                                   aria-expanded=\"false\" aria-controls=\"dashboard\">\n");
      out.write("                                    <i class=\"mdi mdi-view-dashboard-outline\"></i>\n");
      out.write("                                    <span class=\"nav-text\">Quản lí thông tin</span> <b class=\"caret\"></b>\n");
      out.write("                                </a>\n");
      out.write("                                <ul  class=\"collapse show\"  id=\"dashboard\"\n");
      out.write("                                     data-parent=\"#sidebar-menu\">\n");
      out.write("                                    <div class=\"sub-menu\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <li  class=\"active\" >\n");
      out.write("                                            <a class=\"sidenav-item-link\" href=\"index.html\">\n");
      out.write("                                                <span class=\"nav-text\">Dịch vụ</span>\n");
      out.write("\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <li >\n");
      out.write("                                            <a class=\"sidenav-item-link\" href=\"analytics.html\">\n");
      out.write("                                                <span class=\"nav-text\">Phụ tùng</span>\n");
      out.write("\n");
      out.write("                                                <!--                                                <span class=\"badge badge-success\">new</span>-->\n");
      out.write("\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li  class=\"has-sub\" >\n");
      out.write("                                <a class=\"sidenav-item-link\" href=\"javascript:void(0)\" data-toggle=\"collapse\" data-target=\"#ui-elements\"\n");
      out.write("                                   aria-expanded=\"false\" aria-controls=\"ui-elements\">\n");
      out.write("                                    <i class=\"mdi mdi-folder-multiple-outline\"></i>\n");
      out.write("                                    <span class=\"nav-text\">Thống kê</span> <b class=\"caret\"></b>\n");
      out.write("                                </a>\n");
      out.write("                                <ul  class=\"collapse\"  id=\"ui-elements\"\n");
      out.write("                                     data-parent=\"#sidebar-menu\">\n");
      out.write("                                    <div class=\"sub-menu\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <li  class=\"has-sub\" >\n");
      out.write("                                            <a href=\"tkdichvufrm.html\">\n");
      out.write("                                                <span class=\"nav-text\">Dịch vụ</span>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <li  class=\"has-sub\" >\n");
      out.write("                                            <a href=\"tkphutungfrm.html\">\n");
      out.write("                                                <span class=\"nav-text\">Phụ tùng</span>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <li  class=\"has-sub\" >\n");
      out.write("                                            <a class=\"sidenav-item-link\" href=\"javascript:void(0)\" data-toggle=\"collapse\" data-target=\"#forms\"\n");
      out.write("                                               aria-expanded=\"false\" aria-controls=\"forms\">\n");
      out.write("                                                <span class=\"nav-text\">Khách hàng</span>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <li  class=\"has-sub\" >\n");
      out.write("                                            <a class=\"sidenav-item-link\" href=\"javascript:void(0)\" data-toggle=\"collapse\" data-target=\"#maps\"\n");
      out.write("                                               aria-expanded=\"false\" aria-controls=\"maps\">\n");
      out.write("                                                <span class=\"nav-text\">Nhà cung cấp</span>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <hr class=\"separator\" />\n");
      out.write("\n");
      out.write("                    <div class=\"sidebar-footer\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"page-wrapper\">\n");
      out.write("                <!-- Header -->\n");
      out.write("                <header class=\"main-header \" id=\"header\">\n");
      out.write("                    <nav class=\"navbar navbar-static-top navbar-expand-lg\">\n");
      out.write("                        <!-- Sidebar toggle button -->\n");
      out.write("                        <button id=\"sidebar-toggler\" class=\"sidebar-toggle\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        </button>\n");
      out.write("                        <!-- search form -->\n");
      out.write("                        <div class=\"search-form d-none d-lg-inline-block\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <button type=\"button\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\">\n");
      out.write("                                    <i class=\"mdi mdi-magnify\"></i>\n");
      out.write("                                </button>\n");
      out.write("                                <input type=\"text\" name=\"query\" id=\"search-input\" class=\"form-control\" placeholder=\"Search\"\n");
      out.write("                                       autofocus autocomplete=\"off\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"search-results-container\">\n");
      out.write("                                <ul id=\"search-results\"></ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"navbar-right \">\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                <!-- User Account -->\n");
      out.write("                                <li class=\"dropdown nav-user ms-4\">\n");
      out.write("                                    <a class=\"nav-link nav-user-img\" href=\"#\" id=\"navbarDropdownMenuLink2\" data-bs-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"margin-left: 84px\">\n");
      out.write("                                        <img src=\"https://i.pinimg.com/280x280_RS/2e/45/66/2e4566fd829bcf9eb11ccdb5f252b02f.jpg\" alt=\"\" class=\"user-avatar-md rounded-circle\" width=\"50px\" height=\"50px\">\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-menu dropdown-menu-right nav-user-dropdown text-center\" aria-labelledby=\"navbarDropdownMenuLink2\">\n");
      out.write("                                        <div class=\"nav-user-info\">\n");
      out.write("                                            <span class=\"status\"></span><span class=\"ml-2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-user mr-2\"></i>Account</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-gear\" viewBox=\"0 0 16 16\">\n");
      out.write("                                            <path d=\"M8 4.754a3.246 3.246 0 1 0 0 6.492 3.246 3.246 0 0 0 0-6.492zM5.754 8a2.246 2.246 0 1 1 4.492 0 2.246 2.246 0 0 1-4.492 0z\"/>\n");
      out.write("                                            <path d=\"M9.796 1.343c-.527-1.79-3.065-1.79-3.592 0l-.094.319a.873.873 0 0 1-1.255.52l-.292-.16c-1.64-.892-3.433.902-2.54 2.541l.159.292a.873.873 0 0 1-.52 1.255l-.319.094c-1.79.527-1.79 3.065 0 3.592l.319.094a.873.873 0 0 1 .52 1.255l-.16.292c-.892 1.64.901 3.434 2.541 2.54l.292-.159a.873.873 0 0 1 1.255.52l.094.319c.527 1.79 3.065 1.79 3.592 0l.094-.319a.873.873 0 0 1 1.255-.52l.292.16c1.64.893 3.434-.902 2.54-2.541l-.159-.292a.873.873 0 0 1 .52-1.255l.319-.094c1.79-.527 1.79-3.065 0-3.592l-.319-.094a.873.873 0 0 1-.52-1.255l.16-.292c.893-1.64-.902-3.433-2.541-2.54l-.292.159a.873.873 0 0 1-1.255-.52l-.094-.319zm-2.633.283c.246-.835 1.428-.835 1.674 0l.094.319a1.873 1.873 0 0 0 2.693 1.115l.291-.16c.764-.415 1.6.42 1.184 1.185l-.159.292a1.873 1.873 0 0 0 1.116 2.692l.318.094c.835.246.835 1.428 0 1.674l-.319.094a1.873 1.873 0 0 0-1.115 2.693l.16.291c.415.764-.42 1.6-1.185 1.184l-.291-.159a1.873 1.873 0 0 0-2.693 1.116l-.094.318c-.246.835-1.428.835-1.674 0l-.094-.319a1.873 1.873 0 0 0-2.692-1.115l-.292.16c-.764.415-1.6-.42-1.184-1.185l.159-.291A1.873 1.873 0 0 0 1.945 8.93l-.319-.094c-.835-.246-.835-1.428 0-1.674l.319-.094A1.873 1.873 0 0 0 3.06 4.377l-.16-.292c-.415-.764.42-1.6 1.185-1.184l.292.159a1.873 1.873 0 0 0 2.692-1.115l.094-.319z\"/>\n");
      out.write("                                            </svg>\n");
      out.write("                                            Setting\n");
      out.write("                                        </a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                            <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-box-arrow-right\" viewBox=\"0 0 16 16\">\n");
      out.write("                                            <path fill-rule=\"evenodd\" d=\"M10 12.5a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-9a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v2a.5.5 0 0 0 1 0v-2A1.5 1.5 0 0 0 9.5 2h-8A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-2a.5.5 0 0 0-1 0v2z\"/>\n");
      out.write("                                            <path fill-rule=\"evenodd\" d=\"M15.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 0 0-.708.708L14.293 7.5H5.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708l3-3z\"/>\n");
      out.write("                                            </svg>\n");
      out.write("                                            Logout\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </header>\n");
      out.write("                                        \n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"well\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-6 col-sm-6 col-md-6\">\n");
      out.write("                                    <address>\n");
      out.write("                                        <strong>GaraMan</strong>\n");
      out.write("                                        <br>\n");
      out.write("                                        Trần Phú Hà Đông\n");
      out.write("                                        <br>\n");
      out.write("                                        <abbr title=\"Phone\">Phone:</abbr> 01234567\n");
      out.write("                                    </address>\n");
      out.write("                                    <div>\n");
      out.write("                                        <p>Nhân viên: Nguyễn Đăng Chương</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-6 col-sm-6 col-md-6 text-right\">\n");
      out.write("                                    <p>\n");
      out.write("                                        <em>Date: 14/11/2022</em>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <em>Khách hàng: Lê Văn Công</em>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <em>Địa chỉ: Trần Phú, Hà Đông</em>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <h1>Hóa đơn dịch vụ chi tiết</h1>\n");
      out.write("                                </div>\n");
      out.write("                                </span>\n");
      out.write("                                <table class=\"table table-hover\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Dịch vụ</th>\n");
      out.write("                                            <th class=\"text-center\">Số lượng</th>\n");
      out.write("                                            <th class=\"text-center\">Giá</th>\n");
      out.write("                                            <th class=\"text-center\">Tổng tiền</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"col-md-6\"><em>Bảo dưỡng ô tô</em></h4></td>\n");
      out.write("                                            <td class=\"col-md-1\" style=\"text-align: center\"> 2 </td>\n");
      out.write("                                            <td class=\"col-md-2 text-center\">1.300.000 VND</td>\n");
      out.write("                                            <td class=\"col-md-2 text-center\">2.600.000 VND</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"col-md-6\"><em>Bảo hiểm ô tô</em></h4></td>\n");
      out.write("                                            <td class=\"col-md-1\" style=\"text-align: center\"> 1 </td>\n");
      out.write("                                            <td class=\"col-md-2 text-center\">2.000.000 VND</td>\n");
      out.write("                                            <td class=\"col-md-2 text-center\">2.000.000 VND</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <td></td>\n");
      out.write("                                            <td></td>\n");
      out.write("                                            <td class=\"text-right\">\n");
      out.write("                                            <p>\n");
      out.write("                                                <strong>Tổng tiền:</strong>\n");
      out.write("                                            </p>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                            <p>\n");
      out.write("                                                <strong>4.600.000 VND</strong>\n");
      out.write("                                            </p>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\" style=\"margin-top: 100px\">\n");
      out.write("                        <div class=\"well\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <h1>Hóa đơn phụ tùng chi tiết</h1>\n");
      out.write("                                </div>\n");
      out.write("                                </span>\n");
      out.write("                                <table class=\"table table-hover\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Phụ tùng</th>\n");
      out.write("                                            <th class=\"text-center\">Số lượng</th>\n");
      out.write("                                            <th class=\"text-center\">Giá</th>\n");
      out.write("                                            <th class=\"text-center\">Tổng tiền</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"col-md-6\"><em>Lốp xe</em></h4></td>\n");
      out.write("                                            <td class=\"col-md-1\" style=\"text-align: center\"> 2 </td>\n");
      out.write("                                            <td class=\"col-md-2 text-center\">300.000 VND</td>\n");
      out.write("                                            <td class=\"col-md-2 text-center\">600.000 VND</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"col-md-6\"><em>Vô lăng</em></h4></td>\n");
      out.write("                                            <td class=\"col-md-1\" style=\"text-align: center\"> 2 </td>\n");
      out.write("                                            <td class=\"col-md-2 text-center\">300.000 VND</td>\n");
      out.write("                                            <td class=\"col-md-2 text-center\">600.000 VND</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <td></td>\n");
      out.write("                                            <td></td>\n");
      out.write("                                            <td class=\"text-right\">\n");
      out.write("                                            <p>\n");
      out.write("                                                <strong>Tổng tiền:</strong>\n");
      out.write("                                            </p>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                            <p>\n");
      out.write("                                                <strong>1.200.000 VND</strong>\n");
      out.write("                                            </p>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"margin-top: 40px;margin-bottom: 30px; border: 1px solid red\">\n");
      out.write("                        <h1 class=\"text-danger text-center\">Tổng tiền: 5.800.000 VND</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <footer class=\"footer mt-auto\">\n");
      out.write("                    <script>\n");
      out.write("                        var d = new Date();\n");
      out.write("                        var year = d.getFullYear();\n");
      out.write("                        document.getElementById(\"copy-year\").innerHTML = year;\n");
      out.write("                    </script>\n");
      out.write("                </footer>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyDCn8TFXGg17HAUcNpkwtxxyT9Io9B_NcM\" defer></script>\n");
      out.write("        <script src=\"assets1/plugins/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/toaster/toastr.min.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/slimscrollbar/jquery.slimscroll.min.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/charts/Chart.min.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/ladda/spin.min.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/ladda/ladda.min.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/jquery-mask-input/jquery.mask.min.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/select2/js/select2.min.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/jvectormap/jquery-jvectormap-2.0.3.min.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/jvectormap/jquery-jvectormap-world-mill.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/daterangepicker/moment.min.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("        <script src=\"assets1/plugins/jekyll-search.min.js\"></script>\n");
      out.write("        <script src=\"assets1/js/sleek.js\"></script>\n");
      out.write("        <script src=\"assets1/js/chart.js\"></script>\n");
      out.write("        <script src=\"assets1/js/date-range.js\"></script>\n");
      out.write("        <script src=\"assets1/js/map.js\"></script>\n");
      out.write("        <script src=\"assets1/js/custom.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.25/js/dataTables.bootstrap5.min.js\"></script>\n");
      out.write("        <script src=\"./main.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("                        function showInfo(id, ten, gia, moTa) {\n");
      out.write("                            $('#myDV p[name=\"id\"]').text(id)\n");
      out.write("                            $('#myDV p[name=\"tenDV\"]').text(ten)\n");
      out.write("                            $('#myDV p[name=\"giaDV\"]').text(gia)\n");
      out.write("                            $('#myDV p[name=\"moTa\"]').text(moTa)\n");
      out.write("                            $('#myDV').modal('show')\n");
      out.write("                        }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}