/*++++++++++++++++++++++++++++++++++++
Filter Dropdown
++++++++++++++++++++++++++++++++++++++*/
function dropdown() {
    document.getElementById("facultyDropdown").classList.toggle("show");
}
function filterFunction() {
    var input, filter, ul, li, a, i;
    input = document.getElementById("dropdownInput");
    filter = input.value.toUpperCase();
    div = document.getElementById("facultyDropdown");
    a = div.getElementsByTagName("a");
    for (i = 0; i < a.length; i++) {
        txtValue = a[i].textContent || a[i].innerText;
        if (txtValue.toUpperCase().indexOf(filter) > -1) {
            a[i].style.display = "";
        } else {
            a[i].style.display = "none";
        }
    }
}

/*++++++++++++++++++++++++++++++++++++
On Load
++++++++++++++++++++++++++++++++++++++*/
function load() {
    /* Fill Emails */
    const emails = document.querySelectorAll("[data-email]");
    console.log(emails);
    emails.forEach((el) => {
        let email = el.getAttribute("data-email"),
            prefix = el.getAttribute("data-prefix");
        el.setAttribute("href", "mailto: " + email + "@" + prefix);
        el.setAttribute("title", email + "@" + prefix);
    });
}
