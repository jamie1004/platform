<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Rsupport CTI</title>
        <link href='<c:url value="/resources/css/styles.css"/>' rel="stylesheet"  type="text/css" > 
        <link href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css" rel="stylesheet" crossorigin="anonymous" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed">
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Rsupport online</a>
            <button class="btn btn-link btn-sm order-1 order-lg-0" id="sidebarToggle" href="# "><i class="fas fa-bars"></i></button>
            <!-- Navbar Search-->
            <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
                <div class="input-group">
                    <input class="form-control" type="text" placeholder="Search" aria-label="Search" aria-describedby="basic-addon2" />
                    <div class="input-group-append">
                        <button class="btn btn-primary" type="button"><i class="fas fa-search"></i></button>
                    </div>
                </div>
            </form>
            <!-- Navbar-->
            <ul class="navbar-nav ml-auto ml-md-0">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="userDropdown" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                        <a class="dropdown-item" href="/ctiadmin.jsp">admin</a>
                        <a class="dropdown-item" href="#"></a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="/login.jsp">Logout</a>
                    </div>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                            <div class="sb-sidenav-menu-heading">Support</div>
                            <!--recode Dropnav-->
                            <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseRecode" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                Recode
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseRecode" aria-labelledby="headingOne" data-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="layout-static.html">Add</a>
                                    <a class="nav-link" href="layout-sidenav-light.html">Find</a>
                                </nav>
                            </div>
                             <!--admin Dropnav-->
                            <a class="nav-link" href="index.html">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                ADMIN
                            </a>
                            <div class="sb-sidenav-menu-heading">Tool</div> 
                             <!--sms Dropnav-->
                            <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                Service
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="layout-static.html">SMS</a>
                                    <a class="nav-link" href="layout-sidenav-light.html">Email</a>
                                </nav>
                            </div>
                        </div>
                    </div>
                </nav>
            </div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid">
                        <h1 class="mt-4">Support</h1>
                        <br>
                        <!-- <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="index.html"></a></li>
                            <li class="breadcrumb-item active">Tables</li>
                        </ol> -->
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table mr-1"></i>
                                SUPPORT INSERT 
                            </div>
                            <div class ="card-body">
                                    <div class="container-fluid">
                                        <!-- <table class = "table table-bordered" id="insert_table"> -->
                                            <div class="row" style="margin-left: 0.2%";>
                                                <div class ="form-group"></div>
                                                <div>
                                                    <select name="first_cata">
                                                        <option value="RC">RemoteCall</option>
                                                        <option value="RV">Remoteview</option>
                                                        <option value="RM">Remotemeeting</option>
                                                        <option value="RS">RemoteSeminar</option>
                                                    </select>
                                                </div>
                                                <div >
                                                    <select name="second_cata">
                                                        <option value="RC">1</option>
                                                        <option value="RV">2</option>
                                                        <option value="RM">3</option>
                                                        <option value="RS">4</option>
                                                    </select>
                                                </div>
                                                <div>
                                                    <select name="thrid_cata">
                                                        <option value="RC">RemoteCall</option>
                                                        <option value="RV">Remoteview</option>
                                                        <option value="RM">Remotemeeting</option>
                                                        <option value="RS">RemoteSeminar</option>
                                                    </select>
                                                </div>
                                                <div>
                                                    <select name="channel_cata">
                                                        <option value="tel">유선</option>
                                                        <option value="online">온라인</option>
                                                    </select>
                                                </div>
                                                <div>
                                                    <select name="inout_cata">
                                                        <option value="tel">in</option>
                                                        <option value="online">out</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <br>
                                            <div id="insert_board">
                                                <div class="row">    
                                                        <div class="col-md-6">
                                                            <tr style="padding-bottom: 20%;">
                                                                <td>
                                                                    <input type="text" class="form-control" placeholder="이름" name="insert_name" maxlength="50">
                                                                </td>
                                                                <td>
                                                                    <input type="number" class="form-control" placeholder="번호" name="insert_num" maxlength="50">
                                                                </td>
                                                                <td>
                                                                    <input type="email" class="form-control" placeholder="이메일" name="insert_email" maxlength="50">
                                                                </td>
                                                                <td>
                                                                    <input type="text" class="form-control" placeholder="문의사항" name="insert_q" maxlength="2048" style="height: 150px;">
                                                                </td>
                                                            </tr>                                        
                                                        </div>
                                                <div class="col-md-6">
                                                    <div>
                                                        <tr>
                                                            <td style="padding-bottom: 10px;">
                                                                <input type="text" class="form-control" placeholder="회사명" name="insert_comp" maxlength="50">
                                                            </td>
                                                            <td style="padding-bottom: 10px;">
                                                                <input type="text" class="form-control" placeholder="대표 ID" name="insert_id" maxlength="50">
                                                            </td>
                                                            <td style="padding-bottom: 10px;">
                                                                <input type="text" class="form-control" placeholder="사용자 ID" name="insert_userid" maxlength="50">
                                                            </td>
                                                            <td style="padding-bottom: 10px;">
                                                                <input type="text" class="form-control" placeholder="지원사항" name="insert_sup" maxlength="2048" style="height: 150px;">
                                                            </td>
                                                        </tr>    
                                                    </div>
                                                </div>
                                            </div> 
                                        </div>
                                    <!-- </table> -->
                                </div>
                            </div>

                        </div>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table mr-1"></i>
                                DataTable Example
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                            <tr>
                                                <th>Name</th>
                                                <th>Position</th>
                                                <th>Office</th>
                                                <th>Age</th>
                                                <th>Start date</th>
                                                <th>Salary</th>
                                            </tr>
                                        </thead>
                                        <tfoot>
                                            <tr>
                                                <th>Name</th>
                                                <th>Position</th>
                                                <th>Office</th>
                                                <th>Age</th>
                                                <th>Start date</th>
                                                <th>Salary</th>
                                            </tr>
                                        </tfoot>
                                        <tbody>
                                            
                                            <tr>
                                                <td>Donna Snider</td>
                                                <td>Customer Support</td>
                                                <td>New York</td>
                                                <td>27</td>
                                                <td>2011/01/25</td>
                                                <td>$112,000</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2020</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
        <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
        <script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js" crossorigin="anonymous"></script>
        <script src="assets/demo/datatables-demo.js"></script>
    </body>
</html>
   