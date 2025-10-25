
// ***********************************************

Cypress.Commands.add('writeText', (element, text) => {
    cy.get(element).type(text)

})
Cypress.Commands.add('ClickElement', (element) => {
    cy.get(element).click()

})

Cypress.Commands.add('Select', (element, text) => {
    cy.get(element).select(text)

})