document.getElementById('feedbackForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form from submitting the default way

    // Collect form data
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const feedback = document.getElementById('feedback').value;

    // Prepare the email parameters
    const templateParams = {
        user_name: name,
        user_email: email,
        message: feedback,
        to_email: email,  // Send the email to the user who submitted the form
    };

    // Send email
    emailjs.send('YOUR_SERVICE_ID', 'YOUR_TEMPLATE_ID', templateParams)
    .then(function(response) {
       console.log('SUCCESS!', response.status, response.text);
       document.getElementById('confirmation').style.display = 'block'; // Show confirmation
    }, function(error) {
       console.log('FAILED...', error);
    });

    // Send a thank-you email
    const thankYouParams = {
        user_name: name,
        user_email: email,
        message: "Thank you for visiting Kaihatsu-Sha website.",
    };

    emailjs.send('YOUR_SERVICE_ID', 'YOUR_TEMPLATE_ID', thankYouParams)
    .then(function(response) {
        console.log('Thank you email sent successfully!', response.status, response.text);
    }, function(error) {
        console.log('Failed to send thank you email...', error);
    });
});
