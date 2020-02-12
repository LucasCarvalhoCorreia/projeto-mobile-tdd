# Projeto-Appium-TDD

Projeto desenvolvido com o objetivo de testar conhecimentos em relação a desenvolvimento de testes de automação em TDD para dispositivos móveis.

Conteúdo e descrições do projeto:

projeto-appium-tdd

  - src/main/java (pastas onde estão locaizados os pacotes do projeto.)
  
    - br.com.rsinet.hub_bdd.excel (Pacote responsável por agrupar as classes que vão manipular dados relacionados ao excel.)
      - Constantes.java (Classe responsável por identificar as colunas dentro do arquivo de massa de dados através de variáveis.)
      - ExcelUtils.java (Classe responsável por fazer a comunicação do arquivo de massa de dados com a automação.)
      - PegaMassa.java (Classe responsável por pegar os dos armazenados na massa de dados.)
      
    - br.com.rsinet.hub_tdd.extendReport (Pacote responsável por agrupar as classes que vão manipular dados relacionados ao Extend Report.)
      - ExtendReport.java (Classe responsável por manipular o relatorio gerado pelo extend report.)
      - Prints.java (Classe responsável por tirar os prints.)
      
    - br.com.rsinet.hub_tdd.manager (Pacote responsável por agrupar as classes que vão manipular os drivers.)
      - DriverFactory.java (Classe responsável por criar os drivers, iniciar e fechar o app.)
      - ScreenObjectManager.java (Classe responsável por gerenciar os drivers das telas de teste.)
      
    - br.com.rsinet.hub_tdd.screenObject (Pacote responsável por agrupar as classes que vão manipular os métodos relacionados as telas de teste.)
      - CadastroScreen.java (Classe responsável por localizar e executar métodos na tela de cadastro.)
      - HomeScreen.java (Classe responsável por localizar e executar métodos na tela inicial.)
      - PesquisaScreen.java (Classe responsável por localizar e executar métodos na tela de pesquisa.)
      
    - br.com.rsinet.hub_tdd.testData (Pacote que contém a classe que contem a massa de dados.)
      - MassaDeDados.xlsx (Arquivo responsável por armazenar os dados da massa de dados.)
      
    - br.com.rsinet.hub_tdd.testes (Pacote responsável por agrupar as classes que vão executar os passos de teste do cucumber.)
      - BuscaHome.java (Classe responsável por executar os cenários de teste de consulta por categoria.)
      - BuscaLupa.java (Classe responsável por executar os cenários de teste de consulta por lupa.)
      - Cadastro.java (Classe responsável por executar os cenários de teste de cadastro.)

  - target (Pasta que guarda os prints e o relatório do extend report.)
    - Reports.html (Relatório gerado pelo extend report o final dos testes.)
  
  - ExtendTest.xml (Suíte de testes.)
  
  - pom.xml (Arquivo responsável por baixar e orgnizar as dependências do maven.)
