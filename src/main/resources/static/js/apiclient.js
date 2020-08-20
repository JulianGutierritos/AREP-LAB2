var apiclient = (function () {
	return {
		getMediaYDesv: function (callback) {
			var n = $("#numeros").val().trim();
			var postRequest = $.ajax({
				url: "calcular",
				type: 'POST',
				data: n,
				dataType: 'json',
				contentType: "application/json"
			});
			postRequest.then(
				function (resp) {
				},
				function (resp) {
					if (resp.responseText == "error de parseo") {
						alert("S\u00F3lo es v\u00E1lido digitar n\u00FAmeros separados por comas");
					}
					else{
						var n = resp.responseText.split(" ");
						var s = "Media: " + n[1];
						$(media).val(s);
						s = "Desviaci\u00F3n est\u00E1ndar: " + n[3];
						$(desviacion).val(s);
					}
				}
			);
		}
	};
})();

