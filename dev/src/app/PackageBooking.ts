export interface PackageBooking {
    packBookID:number,
    noOfDays:number,
    noOfPeope:number,
    startDate:number,
    endDate:number,
    packageCost:number,
    pack:{
    packageID: number,
    packageName: string,
    itenary: string,
    location: string,
    hotelName: string,
    hotelCostPerDay: number,
    costPerDay: number
   },
   customer:{
    customerID: number,
    customerName: {
        fname: string,
        lname: string
    },
    gender: string,
    password: string,
    email: string,
    dateOfBirth: number,
    phone: number,
    address: {
        doorno: number,
        street: string,
        city: string,
        pincode: number
    }
   },
   rentTransport: {
    vehicleProvider: string,
    chargesPerDay: number,
    vehicleType: string,
    rentalTransportID: number
   }
}


