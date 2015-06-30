<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <meta name="google-signin-client_id" content="222870154898-rf72pk6b3r6omnesd51jgiks3bhrefd5.apps.googleusercontent.com">
  <title>Login to continue</title>
</head>
<body>
<div class="g-signin2" data-onsuccess="onSignIn"></div>
</body>
<script>
    function onSignIn(googleUser) {
        var profile = googleUser.getBasicProfile();
        console.log('ID: ' + profile.getId()); // Do not send to your backend! Use an ID token instead.
        console.log('Name: ' + profile.getName());
        console.log('Image URL: ' + profile.getImageUrl());
        console.log('Email: ' + profile.getEmail());

        signOut();
    }
    function signOut() {
        var auth2 = gapi.auth2.getAuthInstance();
        auth2.signOut().then(function () {
            console.log('User signed out.');
        });
    }
</script>
</html>