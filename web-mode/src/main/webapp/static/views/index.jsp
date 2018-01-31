<html>
<head>
    <meta http-equiv="content-type" content="txt/html; charset=utf-8"/>
</head>
<body>
<h2>hello world in this page of view directory.</h2>
<form>
   <button type="button" id="btn_submit"> submit </button>
</form>
</body>
<script src="http://libs.baidu.com/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript">
    $(function()
    { 
		$("#btn_submit").click(
		function () {
            var data = {
                "name": 12345,
                "password": 456
            };
			$.ajax({
                type: "POST",
                url: "/home/testHome",
                async: false,
                dataType: "json",
				contentType: "application/json;charset=UTF-8",
                data: JSON.stringify(data),
                success: function (result) 
				{
					if ("0" == result.resultCode) {
						alert(result.description);
					}
					else
                    {
						alert("failed options.");
					}
				},
                error: function (result) {
                    alert("error.");
                }
            });
        });
    });
    
</script>

 

</html>
