<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<style>
.error2 {
	color: red
}
</style>
<form:form class="form-horizontal" commandName="registerCommand"
	action="userAction" method="post">
	<fieldset>

		<!-- Form Name -->
		<legend>Form Name</legend>


		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="name">Enter Name</label>
			<div class="col-md-4">

				<form:input path="name" id="name" />

				<form:errors path="name" cssClass="error2"></form:errors>
			</div>
		</div>

		<div class="form-group">
			<label class="col-md-4 control-label" for="address">Enter
				Address</label>
			<div class="col-md-4">

				<form:input path="address" id="address" cssClass="" />
				<%-- <form:input id="mobile" path="mobile" 
					placeholder="Enter Address" class="form-control input-md"
					required=""> --%>
				</form>
				<form:errors path="address" cssClass="error2"></form:errors>
				<!-- both path should be same -->
			</div>
		</div>

		<!-- 	!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="mobile">Enter
				Mobile</label>
			<div class="col-md-4">

				<form:input path="mobile" id="mobile" cssClass="" />
				<%-- <form:input id="mobile" path="mobile" 
					placeholder="Enter Mobile" class="form-control input-md"
					required=""> --%>
				</form>
				<form:errors path="mobile" cssClass="error2"></form:errors>
				<!-- both path should be same -->
			</div>
		</div>



		<!-- Multiple Radios (inline) -->
		<div class="form-group">
			<label class="col-md-4 control-label" for="Gender"></label>
			<div class="col-md-4">
				<form:radiobutton path="gender" value="Male" />
				Male
				<form:radiobutton path="gender" value="Female" />
				Female
				<form:errors path="gender" cssClass="error2"></form:errors>
			</div>
		</div>


		<!-- Button -->
		<div class="form-group">
			<label class="col-md-4 control-label" for="register"></label>
			<div class="col-md-4">
				<input id="register" type="submit" path="register"
					class="btn btn-success" value="register">

			</div>
		</div>

	</fieldset>


</form:form>