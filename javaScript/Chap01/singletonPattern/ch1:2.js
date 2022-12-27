class Singletone{
    constructor() {
        if(!Singletone.instance){
            Singletone.instance = this
        }
        return Singletone.instance
    }
    getInstance(){
        return this.instance
    }
}
const a = new Singletone()
const b = new Singletone()
console.log(a===b) //true