const URL = 'mysql://localhost:3306/gisdb'
const createConnection = url => ({"url":url})
class DB{
    constructor(url){
        if(!DB.instance){
            DB.instance = createConnection(url)
        }
        return DB.instance
    }
    connect(){
        return this.instance
    }
}
const a = new DB(URL)
const b = new DB(URL)
console.log(a === b) //true