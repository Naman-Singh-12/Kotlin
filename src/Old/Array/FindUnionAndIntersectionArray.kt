package Old.Array

fun main(){
    print("Find Union and Intersection of two Arrays\n")
    val arr1 = arrayOf(1,2,3,4,5)
    val arr2 = arrayOf(4,5,6,7,8,9)
    findUnionAndIntersection(arr1, arr2)
}

fun findUnionAndIntersection(arr1: Array<Int>, arr2: Array<Int>) {

    var unionArr = ""
    var intersectionArr = ""

    for(i in 0 until arr1.size){

        for(j in 0 until arr2.size){

            if(arr1[i] == arr2[j])
            {
                unionArr = unionArr+arr1[i].toString()
            }else{

               // println("Intersection Old.Array : $intersectionArr , Arr1 > ${arr1[i]}, Arr2 > ${arr2[j]}")
                if(!intersectionArr.contains(arr1[i].toString())){
                    intersectionArr = intersectionArr+arr1[i].toString()
                }

                if(!intersectionArr.contains(arr2[j].toString())){
                    intersectionArr = intersectionArr+arr2[j].toString()
                }
            }
        }
    }

   // var unionArr[union]
    println("Union of arrays is : $unionArr")
    println("Inter Section of arrays is : $intersectionArr")

}
