def url = new URL(args[0])

HttpURLConnection connection = (HttpURLConnection) url.openConnection()
connection.setRequestMethod("GET")
connection.connect()
if (connection.responseCode == 200 || connection.responseCode == 201 || connection.responseCode==302) {
   println "Response Code/Message: ${connection.responseCode} / ${connection.responseMessage}"  
   System.exit(0) 
} else {
   println "Error: Response Code/Message: ${connection.responseCode} / ${connection.responseMessage} for URL: ${url}"
   System.exit(2)
}
