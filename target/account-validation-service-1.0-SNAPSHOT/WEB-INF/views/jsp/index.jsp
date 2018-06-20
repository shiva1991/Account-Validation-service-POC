<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Account validation</title>
    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Account Validation Form</a>
        </div>
    </div>
</nav>

<div class="container-fluid account-validation-form" style="position: absolute; top: 60px">
    <div class="row">
        <form class="form-horizontal" role="form" id="AccountValidateForm" method="post" action="/account/validate">
            <fieldset>
                <div class="col-md-6">
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Line of Business</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Line of Business" name="lineOfBusiness" id="lineOfBusiness" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">System Itendifier</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="System Itendifier" name="systemIdentifier" id="systemIdentifier"
                                   class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Function</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Function" name="function" id="function" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">CorrelationId</label>

                        <div class="col-sm-4">
                            <input type="text" placeholder="CorrelationId" name="correlationId" id="correlationId" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Bank AccountNumber</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Bank AccountNumber" name="accountValidationParameters['bankAccountNumber']" id="bankAccountNumber"
                                   class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Bank Routing Number</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Bank Routing Number" name="accountValidationParameters['bankRoutingNumber']" id="bankRoutingNumber"
                                   class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Business Name</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Business Name" name="accountValidationParameters['businessName']" id="businessName" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">First Name</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="First Name" name="accountValidationParameters['firstName']" id="firstName" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Middle Name</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Middle Name" name="accountValidationParameters['middleName']" id="middleName" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Last Name</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Last Name" name="accountValidationParameters['lastName']" id="lastName" class="form-control">
                        </div>
                    </div>


                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Name Prefix</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Name Prefix" name="accountValidationParameters['namePrefix']" id="namePrefix" class="form-control">
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Name Suffix</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Name Suffix" name="accountValidationParameters['nameSuffix']" id="nameSuffix" class="form-control">
                        </div>
                    </div>


                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Address Line1</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Address Line1" name="accountValidationParameters['addressLine1']" id="addressLine1" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Address Line2</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Address Line2" name="accountValidationParameters['addressLine2']" id="addressLine2" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">City</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="City" name="accountValidationParameters['city']" id="city" class="form-control">
                        </div>
                    </div>


                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">State</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="State" name="accountValidationParameters['state']" id="state" class="form-control">
                        </div>
                    </div>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Zip</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Zip" name="accountValidationParameters['zip']" id="zip" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Home Phone</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Home Phone" name="accountValidationParameters['homePhone']" id="homePhone" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Work Phone</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Work Phone" name="accountValidationParameters['workPhone']" id="workPhone" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">TaxId</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="TaxId" name="accountValidationParameters['taxId']" id="taxId" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">D.O.B</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Date of Birth" name="accountValidationParameters['dateOfBirth']" id="dateOfBirth" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Document Issuer</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Document Issuer" name="accountValidationParameters['documentIssuer']" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Document Type</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Document Type" name="accountValidationParameters['documentType']" class="form-control">
                        </div>
                    </div>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-sm-4 control-label" for="textinput">Document Id</label>

                        <div class="col-sm-8">
                            <input type="text" placeholder="Document Id" name="accountValidationParameters['documentIdNumber']" class="form-control">
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-offset-4 col-sm-8">
                            <div class="pull-right">
                                <button type="submit" id="submit" class="btn btn-primary">Submit</button>
                            </div>
                        </div>
                    </div>
                </div>
            </fieldset>
        </form>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<spring:url value="/resources/core/js/account-validate.js" var="coreJs"/>
<script src="${coreJs}"></script>

</body>
</html>