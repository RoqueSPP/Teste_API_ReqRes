const { fakerPT_BR: faker } = require('@faker-js/faker');


export const info ={
    firstName: faker.person.fullName(),
    lastNeme : faker.person.lastName(),
    cpf: faker.cpf,
    email: faker.internet.email(),
    phone: faker.phone.number(),
    password: faker.internet.password()
    }