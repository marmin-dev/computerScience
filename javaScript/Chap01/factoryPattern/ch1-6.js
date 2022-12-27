class Latte{
    constructor(){
        this.name ="latte"
    }
}
class Espresso{
    constructor(){
        this.name ="Espresso"
    }
}
class LatteFactory{
    static createCoffee(){
        return new Latte()
    }
}
class EspressoFactory{
    static createCoffee(){
        return new Espresso()
    }
}
const factoryList ={LatteFactory,EspressoFactory}
class CoffeeFactrory{
    static createCoffee(type){
        const factory = factoryList[type]
        return factory.createCoffee()
    }
}
const main =()=>{
    //라떼 주문
    const coffee = CoffeeFactrory.createCoffee("LatteFactory")
    console.log(coffee.name)//latte
}
main()