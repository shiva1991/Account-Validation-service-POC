<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Account Details</title>
    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Account Details</a>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-6">
            <div class="form-group">
                <label class="col-sm-4 control-label">Decision</label>

                <div class="col-sm-8">
                    <label class="control-label">${account.decision}</label>
                </div>
            </div>

            <c:if test="${account.rawResponse ne null}">
                <div class="form-group">
                    <label class="col-sm-4 control-label">Bank Routing Number</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.bankRoutingNumber}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">Bank Account Number</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.bankAccountNumber}</label>
                    </div>
                </div>
            </c:if>

            <c:if test="${account.rawResponse ne null and account.rawResponse.accountOwner ne null}">
                <div class="form-group">
                    <label class="col-sm-4 control-label">ConditionCode</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.accountOwner.conditionCode}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">NameMatch</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.accountOwner.nameMatch}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">FirstNameMatch</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.accountOwner.firstNameMatch}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">LastNameMatch</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.accountOwner.lastNameMatch}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">MiddleNameMatch</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.accountOwner.middleNameMatch}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">OverallMatchScore</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.accountOwner.overallMatchScore}</label>
                    </div>
                </div>
            </c:if>

            <c:if test="${account.rawResponse ne null and account.rawResponse.accountStatus ne null}">
                <div class="form-group">
                    <label class="col-sm-4 control-label">Secondary StatusCode</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.accountStatus.secondaryStatusCode}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">Additional StatusCode</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.accountStatus.additionalStatusCode}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">Last UpdateDate</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.accountStatus.lastUpdateDate}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">Added Or ClosedDate</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.accountStatus.addedOrClosedDate}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">Previous StatusCode</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.accountStatus.previousStatusCode}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-4 control-label">Primary StatusCode</label>

                    <div class="col-sm-8">
                        <label class="control-label">${account.rawResponse.accountStatus.primaryStatusCode}</label>
                    </div>
                </div>
            </c:if>
        </div>
    </div>
</div>
</body>
</html>