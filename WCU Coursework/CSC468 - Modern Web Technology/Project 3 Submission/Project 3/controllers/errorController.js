const { application } = require("express");
const httpStatus = require("http-status-codes");

exports.pageNotFoundError = (req, res) => { //Handle all requests not previously ha
    let errorCode = httpStatus.NOT_FOUND;
    res.status(errorCode); //Status is set to httpStatus not found
    res.render("error"); //Render error.ejs
};

exports.internalServerError = (error, req, res, next) => { //Handle any internal server errors
    let errorCode = httpStatus.INTERNAL_SERVER_ERROR;
    console.log('ERROR occured: ${error.stack}')
    res.status(errorCode);
    res.send('${errorCode} | Sorry, our application is taking nap!');
};

//app.use(errorController.pageNotFoundError); //Add error handlers as middleware functions
//app.use(errorController.internalServerError); //Add error handlers as middleware functions

