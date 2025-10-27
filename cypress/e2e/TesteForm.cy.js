import { ele } from "../../src/locator/TesteLocator";
import { info } from "../../src/utils/faker";

describe('Teste page', () => {
  beforeEach(() => {
    cy.visit('https://roquespp.github.io/index2/')
  })

  it('Verificar o titulo da aplicaçãp', () => {

    cy.title().should('be.equal', 'Pagina de testes')
  })
  it('Preencher os campos obrigatórios', () => {
    cy.writeText(ele.firstname, info.firstName)
    cy.writeText(ele.lastname, info.lastNeme)
    cy.writeText(ele.email, info.email)
    cy.writeText(ele.password, info.password)
    cy.writeText(ele.age, '46')
    cy.writeText(ele.birth, '1990-08-10')
    cy.writeText(ele.height, '1.73')
    cy.writeText(ele.peso, '110')
    cy.writeText(ele.blood, 'O+')
    cy.writeText(ele.skin, 'Pardo')
    cy.writeText(ele.cpf, '26653645364')
    cy.writeText(ele.rg, '1887653425')
    cy.writeText(ele.phone, '46110492')
    cy.writeText(ele.mobile, '998887765')
    cy.writeText(ele.email, 'email@email.com')
    cy.writeText(ele.mather, 'Aladir')
    cy.writeText(ele.father, 'José')
    cy.Select(ele.select1, 'Masculino')
    cy.Select(ele.select2, 'Leão')
    cy.writeText(ele.cep, '06725110')
    cy.wait(2000)
    cy.writeText(ele.numero, '41')
    cy.ClickElement(ele.btnValidate)
    cy.wait(2000)
    cy.get('body > p').should('be.visible')
})
});