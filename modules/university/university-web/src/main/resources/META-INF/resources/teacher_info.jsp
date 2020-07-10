<%@ page import="com.liferay.myportlet.fakemodel.UniversityPerson" %><%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: fateme--%>
<%--  Date: 7/8/20--%>
<%--  Time: 8:03 AM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>


<%@include file="init.jsp"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>

<%
    List<UniversityPerson> universityPersons =
            (List<UniversityPerson>) renderRequest.getAttribute(TeacherPortletKeys.FAKE_UNIVERSITY_PERSONS);
    //Long teacherId = ParamUtil.getLong(renderRequest,"teacherId");

    //   if(teacherId > 0){
//        Teacher teacher = TeacherLocalServiceUtil.getTeacher(teacherId);
//        List<Teacher> teachers = new ArrayList<>();
//        teachers.add(teacher);

    int universityPersonId = 1;
    UniversityPerson universityPerson = universityPersons.get(universityPersonId);
%>

<liferay-ddm:template-renderer
        className="<%= Teacher.class.getName() %>"
        displayStyle="<%= displayStyle %>"
        displayStyleGroupId="<%= displayStyleGroupId %>"
        entries="<%= universityPersons %>">

    <!DOCTYPE html>
    <html dir="rtl" lang="fa">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
        <meta name="robots" content="index, follow" />
    </head>
    <body  >
    <div class="rtl">
        <div class="wrapper">
            <div class="container">
                <div class="row page" id="page" data-display-mode="page">


                    <div class="col-12 card">
                        <header class="header">
                            <div class="menu">
                                <div class="right">
                                    <a class="menuBtn">
                                        <i class="icon-reorder"></i>
                                        <span>منو</span>
                                    </a>
                                </div>

                            </div>
                            <div class="info">
                                <div class="image">
                                    <img

                                    />
                                </div>
                                <div class="content">
                                    <h3 class="code">دانشیار</h3>
                                    <h1 class="title">محمود رضا هاشمی</h1>
                                    <h3 class="subtitle">
                                        پردیس دانشکده های فنی / دانشکده مهندسی برق و کامپیوتر
                                    </h3>
                                </div>

                                <!-- <div class="content left GoogleScholar">
                                    <div class="text">
                                        <span><img src="img/gsc.png"/></span>
                                        <br />
                                        Citations: <b>606</b>
                                        <br />
                                        h-index: <b>12</b>
                                    </div>
                                </div>
                                <div class="content left scopus">
                                    <div class="text">
                                        <span><img src="img/sc.png"/></span>
                                        <br />
                                        Citations: <b>372</b>
                                        <br />
                                        h-index: <b>10</b>
                                    </div>
                                </div> -->
                            </div>
                        </header>
                        <main class="body information" id="root">
                            <div class="SideColumn">
                                <h3><i class="icon-edit-sign"></i> تحصیلات</h3>
                                <ul class="timeline">
                                    <li>Ph.D ، اتاوا ، برق <span class="years">۱۳۷۳ ← ۱۳۸۰</span></li>
                                    <li>M.Sc ، تهران ، برق- کنترل <span class="years">۱۳۶۸ ← ۱۳۷۲</span></li>
                                    <li>کارشناسی ، تهران ، برق- الکترونیک <span class="years">۱۳۶۴ ← ۱۳۶۸</span></li>
                                </ul>

                                <div class="tags">
                                    <h3><i class="icon-check-sign"></i> زمینه کاری</h3>
                                    <span class="tag">فناوری اطلاعات</span>
                                    <span class="tag">معماری کامپیوتر</span>
                                </div>

                                <h3><i class="icon-phone-sign"></i> اطلاعات تماس</h3>
                                <div><b>اتاق: </b>۲-۴۱۱</div>
                                <div><b>شماره تماس: </b>۸۲۰۸۴۳۱۰</div>
                                <div><b>پست الکترونیکی: </b><span data-email-fill></span></div>
                            </div>

                            <section class="main">
                                <div class="bio showmore" data-max-height="200" data-showmore="نمایش بیشتر" data-showless="بستن">
                                    <h2>بیوگرافی</h2>
                                    <p>
                                        دکتر محمودرضا هاشمی، دانشیار دانشکده مهندسی برق و کامپیوتر پردیس دانشکده ­­های فنی دانشگاه تهران
                                        می‌باشد. وی مدارک کارشناسی و کارشناسی ارشد خود را از دانشگاه تهران و مدرک دکتری خود را از دانشگاه
                                        اتاوای کانادا دریافت نموده است. دکتر هاشمی موسس و مدیر آزمایشگاه پردازش­های چندرسانه‌ای و
                                        آزمایشگاه ارزیابی ریسک و کشف فراگیر کلاهبرداری در تعاملات الکترونیکی (ارک فتا) دانشگاه تهران
                                        می‌باشد. زمینه‌های تحقیقاتی مورد علاقه ایشان سامانه‌ها و شبکه های چندرسانه‌ای (مالتی مدیا)،
                                        معماری­های نوین برای پردازش­های چند رسانه­ای، امنیت خدمات الکترونیکی، امنیت و اعتماد در رایانش
                                        ابری، و اخیراً بازی­های مبتنی بر رایانش ابری می‌باشد. دکتر هاشمی مشاور ارشد پیاده سازی استراتژی
                                        های فناوری اطلاعات، و تحول دیجیتال برای بسیاری از سازمان ها و نهاد های خصوصی و دولتی بوده است.
                                        آقای دکتر هاشمی از سال ۹۳ رئیس مرکز فناوری اطلاعات و فضای مجازی دانشگاه تهران می باشند. دکتر هاشمی
                                        مشاور ارشد پیاده سازی استراتژی های فناوری اطلاعات، و تحول دیجیتال برای بسیاری از سازمان ها و نهاد
                                        های خصوصی و دولتی بوده است. آقای دکتر هاشمی از سال ۹۳ رئیس مرکز فناوری اطلاعات و فضای مجازی
                                        دانشگاه تهران می باشند.
                                    </p>
                                </div>

                                <div class="shortcuts">
                                    <div class="row">
                                        <div class="col col-12 col-sm-6">
                                            <a href="activities.html" class="">
                                                <i class="icon-briefcase"></i>
                                                <div class="text">
                                                    <span class="title">فعالیت ها</span>
                                                    <span class="subtitle">فعالیت های علمی، اجرایی و پژوهشی</span>
                                                </div>
                                            </a>
                                        </div>
                                        <div class="col col-12 col-sm-6">
                                            <a href="books.html" class="">
                                                <i class="icon-book"></i>
                                                <div class="text">
                                                    <span class="title">کتب</span>
                                                    <span class="subtitle">لیست تمامی کتاب ها</span>
                                                </div>
                                            </a>
                                        </div>
                                        <div class="col col-12 col-sm-6">
                                            <a href="articles.html" class="">
                                                <i class="icon-file-text"></i>
                                                <div class="text">
                                                    <span class="title">مقالات</span>
                                                    <span class="subtitle">لیست تمامی مقالات</span>
                                                </div>
                                            </a>
                                        </div>
                                        <div class="col col-12 col-sm-6">
                                            <a href="theses.html" class="">
                                                <i class="icon-paste"></i>
                                                <div class="text">
                                                    <span class="title">پایان نامه ها</span>
                                                    <span class="subtitle">لیست تمامی پایان نامه ها و رساله ها</span>
                                                </div>
                                            </a>
                                        </div>
                                        <div class="col col-12 col-sm-6">
                                            <a href="lessons.html" class="">
                                                <i class="icon-beaker"></i>
                                                <div class="text">
                                                    <span class="title">دروس و کارگاه</span>
                                                    <span class="subtitle">دروس ارائه شده و کارگاه ها</span>
                                                </div>
                                            </a>
                                        </div>

                                        <div class="col col-12 col-sm-6">
                                            <!-- remove button class and add website link in href -->
                                            <a href="" class="button">
                                                <i class="icon-external-link"></i>
                                                <div class="text">
                                                    <span class="title">وبسایت</span>
                                                    <span class="subtitle">صفحه اختصاصی استاد</span>
                                                </div>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </section>

                        </main>
                    </div>
                </div>
            </div>

            <footer class="footer" id="footer">
                دانشگاه تهران هیچ مسئولیتی در مورد مطالب فوق ندارد.
            </footer>
        </div>

    </div>


    </body>
    </html>


</liferay-ddm:template-renderer>

<%--<%--%>

<%--    }--%>

<%--%>--%>

