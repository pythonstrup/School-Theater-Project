
var hour_select = ""
for (i = 0; i<=12; i++){
	hour_select += "<option val=" + i + ">" + i + "</option>";
}
$("#hour_selector").html(hour_select);

var minute_select = ""
for (i = 0; i<=12; i++){
	minute_select += "<option val=" + i*5 + ">" + i*5 + "</option>";
}
$("#minute_selector").html(minute_select);