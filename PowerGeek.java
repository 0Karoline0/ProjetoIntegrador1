import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PowerGeek {
	public static void main(String args[]) {

		ReadKeys input = new ReadKeys();
		DecimalFormat valores = new DecimalFormat("###,###,###,###.##");
		
		String menuPrincipal;

//==================================COISAS================================================//
		// =========COISAS PARA MANTER CLIENTE======/
		ArrayList<String> nome = new ArrayList();
		ArrayList<String> cpf = new ArrayList();
		ArrayList<String>telefone = new ArrayList();

		String tamanho;
		String nomeTroca;
		String telefoneTroca, cpfTroca;
		String espaco = " ";
		char continuar;

		String opcaoMenu;
		String pesquisa;
		int editarCliente;
		String excluirCliente;
		String editarDado;
		String alerta;

		nome.add("Batman");
		cpf.add("11111111111");
		telefone.add("9-1111-1111");
		// 10
		nome.add("ChiChi");
		cpf.add("22222222222");
		telefone.add("9-2222-2222");
		// 11
		nome.add("Naruto");
		cpf.add("33333333333");
		telefone.add("9-3333-3333");

		// ======COISAS PARA EXIBIR ESTOQUE=======//

		ArrayList<Integer> codigoProd = new ArrayList();
		ArrayList<String> fornecedor = new ArrayList();
		ArrayList<String> nomeProd = new ArrayList();
		ArrayList<String> tipoProd = new ArrayList();
		ArrayList<Double> valorProd = new ArrayList();
		ArrayList<Integer> quantProd = new ArrayList();
		ArrayList<Double> valorTotal = new ArrayList();
		ArrayList<String> universo = new ArrayList();
		ArrayList<String> personagem = new ArrayList();
		ArrayList<String> situacao = new ArrayList();

		// LISTA DE REFERÊNCIA (CARACTERES)
		// Código: 9
		// Nome: 26
		// Universo: 13
		// Personagem: 17
		// Tipo: 16
		// Fornecedor: 15
		// ValorUnitário: 6 casas decimais
		// Quantidade: 3 casas decimais
		// ValorTotal: 16
		// Situação: 10

		String mensagemErro;
		String ultimoElemento;
		String condicao;
		String realzin = "R$ ";
		String separador = "|";

		codigoProd.add(1);
		nomeProd.add("Caneca Mestre Kame");
		universo.add("Dragon Ball");
		personagem.add("Mestre Kame");
		tipoProd.add("Caneca");
		fornecedor.add("Casa do Kame");
		valorProd.add(30.00);
		quantProd.add(25);
		valorTotal.add(valorProd.get(0) * quantProd.get(0));

		codigoProd.add(2);
		nomeProd.add("Chaveiro Batman");
		universo.add("DC");
		personagem.add("Batman");
		tipoProd.add("Chaveiro");
		fornecedor.add("Batcaverna");
		valorProd.add(25.00);
		quantProd.add(4);
		valorTotal.add(valorProd.get(1) * quantProd.get(1));

		codigoProd.add(3);
		nomeProd.add("Camiseta Thor");
		universo.add("Marvel");
		personagem.add("Thor");
		tipoProd.add("Camiseta");
		fornecedor.add("Vahalla");
		valorProd.add(15.00);
		quantProd.add(4);
		valorTotal.add(valorProd.get(2) * quantProd.get(2));

		codigoProd.add(4);
		nomeProd.add("Mochila Akatsuki");
		universo.add("Naruto");
		personagem.add("n/d");
		tipoProd.add("Mochila");
		fornecedor.add("Kakuzu & Cia");
		valorProd.add(99.00);
		quantProd.add(4);
		valorTotal.add(valorProd.get(3) * quantProd.get(3));

		String op = "";
		String variavelTemp;
		String excluirProduto;
		int excluirProdutoInt;
		int indiceProduto;

//==========================================================================================================//
//==========================================================================================================//
//==========================================================================================================//
//=====================================INICIALIZAÇÃO DO PROGRAMA============================================//
//==========================================================================================================//
//==========================================================================================================//
//==========================================================================================================//

		JOptionPane.showMessageDialog(null, "Seja Bem-Vindo ao Power Geek!");

		do {
			System.out.println();
			System.out.println("=============================================================");
			System.out.println("                       POWER GEEK");
			System.out.println("Manter Produtos............................: 1");
			System.out.println("Manter Clientes............................: 2");
			System.out.println("Exibir Estoque.............................: 3");
			System.out.println("Sair do Sistema............................: 4");
			menuPrincipal = input.leitura("Digite uma das opções acima: ");

			while (!menuPrincipal.equals("1") && !menuPrincipal.equals("2") && !menuPrincipal.equals("3")
					&& !menuPrincipal.equals("4")) {
				System.out.print("Dígito Inválido! ");
				menuPrincipal = input.leitura("Insira um dígito válido: ");
			}

//==========================================================================================================//
//==========================================================================================================//
//==========================================================================================================//
//==========================================MANTER PRODUTOS=================================================//
//==========================================================================================================//
//==========================================================================================================//
//==========================================================================================================//

			if (menuPrincipal.equals("1")) {

				//continuar = 'S';
				//op = "";

				
				do  {
					
					continuar = 'S';
					op = "";
					
					System.out.println("======================================");
					System.out.println("              MANTER PRODUTOS");
					System.out.println("Cadastro de produtos.........: 1");
					System.out.println("Pesquisar Produtos...........: 2");
					System.out.println("Editar Produtos..............: 3");
					System.out.println("Excluir Produtos.............: 4");
					System.out.println("Voltar ao menu principal.....: 5");
					op = input.leitura("Selecione uma das opções acima: ");

					while (!op.equals("1") && !op.equals("2") && !op.equals("3") && !op.equals("4") && !op.equals("5")) {
						System.out.print("Dígito inválido! ");
						op = input.leitura("Insira um dígito válido: ");
					}

					//==========================CADASTRO DE PRODUTOS===================//
					if (op.equals("1")) {
						while (continuar == 'S') {

							int indice;
								
								//=======================CÓDIGO=========================//
								//=================TESTES COM O DADO INFORMADO=========//OK!
								System.out.println();
								variavelTemp = (input.leitura("Informe o código do produto: "));
								Boolean isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
								
								while ((!isSomenteInteiro) || ((variavelTemp.length()>9 || variavelTemp.length()<=0)) || (codigoProd.contains(Integer.parseInt(variavelTemp)))) {
									if (!isSomenteInteiro) {
										variavelTemp = input.leitura("Código inválido, informe um código apenas com números: ");
										isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
									}
									while ((variavelTemp.length()>9 || variavelTemp.length()<=0)) {
										if (variavelTemp.length()>9) {
											  variavelTemp = input.leitura("Excedeu o limite de caracteres(9). Informe outro valor: ");
											  isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
										  }else{
											  if (variavelTemp.length()<=0) {
												  variavelTemp = input.leitura("Você precisa informar um código: ");
												  isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
											  }
										  }
									}
									
									
									while (isSomenteInteiro && codigoProd.contains(Integer.parseInt(variavelTemp))) {
										variavelTemp = input.leitura("Já existe um produto com esse código. Informe outro código: ");
										isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
									}
									
									
								}
								
								int codigo = Integer.parseInt(variavelTemp);
								codigoProd.add(codigo);
								
								
								
								
								
								//=======================NOME=========================//

							variavelTemp = input.leitura("Nome do Produto: ");
														
							
							while (variavelTemp.length() > 26 || variavelTemp.equals("") || (nomeProd.contains(variavelTemp))) {
								if (variavelTemp.length() > 26) {
									variavelTemp = input.leitura("Excedeu o limite de caracteres(26). Informe outro nome: ");
								}
								if (variavelTemp=="") {
									variavelTemp = input.leitura("O campo não pode ficar em branco. Informe um nome: ");
								}
								if (nomeProd.contains(variavelTemp)) {
									variavelTemp = input.leitura("Já existe um produto com esse nome. Informe outro nome: ");
								}
							}
							nomeProd.add(variavelTemp);
							

							
							//======================UNIVERSO=======================//
							universo.add(input.leitura("Universo: "));
							indice = universo.size() - 1;
							variavelTemp = universo.get(indice);
							while (variavelTemp.length() > 13 || variavelTemp.equals("")) {
								if (variavelTemp.length() > 13 ) {
									variavelTemp = input.leitura("Excedeu o limite de caracteres(13). Informe outro nome: ");
								}
								if (variavelTemp.equals("")) {
									variavelTemp = input.leitura("O campo não pode ficar em branco. Informe um universo: ");
								}
							}

							universo.set(indice, variavelTemp);

							//======================PERSONAGEM=======================//
							personagem.add(input.leitura("Personagem: "));
							indice = personagem.size() - 1;
							variavelTemp = personagem.get(indice);
							while (variavelTemp.length() > 17 || variavelTemp.equals("")) {
								if (variavelTemp.length()>17) {
									variavelTemp = input.leitura("Excedeu o limite de caracteres(17). Informe outro nome: ");
								}
								if (variavelTemp.equals("")) {
									variavelTemp = input.leitura("O campo não pode ficar em branco. Informe um personagem: ");
								}
							}

							personagem.set(indice, variavelTemp);

							//===================TIPO DE PRODUTO===================//
							tipoProd.add(input.leitura("Tipo de Produto: "));
							indice = tipoProd.size() - 1;
							variavelTemp = tipoProd.get(indice);
							while (variavelTemp.length() > 16 || variavelTemp.equals("")) {
								if (variavelTemp.length()>16) {
									variavelTemp = input.leitura("Excedeu o limite de caracteres(16). Informe outro nome: ");
								}
								if (variavelTemp.equals("")) {
									variavelTemp = input.leitura("O campo não pode ficar em branco. Informe um tipo de produto: ");
								}
							}

							tipoProd.set(indice, variavelTemp);

							//====================FORNECEDOR=====================//
							fornecedor.add(input.leitura("Fornecedor: "));
							indice = fornecedor.size() - 1;
							variavelTemp = fornecedor.get(indice);
							while (variavelTemp.length() > 15 || variavelTemp.equals("")) {
								if (variavelTemp.length()>15) {
									variavelTemp = input.leitura("Excedeu o limite de caracteres (15). Informe outro nome: ");
								}
								if (variavelTemp.equals("")) {
									variavelTemp = input.leitura("O campo não pode ficar em branco. Informe um fornecedor: ");
								}
							}

							fornecedor.set(indice, variavelTemp);

							//===================VALOR UNITÁRIO==================//
							
							variavelTemp = input.leitura("Valor Unitário: R$");
											
							isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
																				
							while ((!(isSomenteInteiro)) || variavelTemp.length()>6 || variavelTemp.length()==0) {
								if (!(isSomenteInteiro)) {
									JOptionPane.showMessageDialog(null, "Informe um número correto", "ERRO", JOptionPane.ERROR_MESSAGE);
									variavelTemp = input.leitura("Valor Unitário: R$");
									isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
								}
								if (variavelTemp.length()>6) {
									variavelTemp = input.leitura("O número não pode ultrapassar 6 casas decimais. Informe outro valor: R$");
									isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
								}
								if (variavelTemp.length()==0) {
									variavelTemp = input.leitura("Você precisa informar um valor: R$");
									isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
								}
			
							}
							
							Double valorTemporario;
							
							valorTemporario = Double.parseDouble(variavelTemp);
														
							valorProd.add(valorTemporario);
														
							
							//==============QUANTIDADE DO PRODUTO===============//
							variavelTemp = input.leitura("Quantidade do Produto: ");
							
							isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
							
							while (!(isSomenteInteiro) || variavelTemp.length()==0 || variavelTemp.length()>3) {
								if (!(isSomenteInteiro)) {
									JOptionPane.showMessageDialog(null, "Valor incorreto", "ERRO", JOptionPane.ERROR_MESSAGE);
									variavelTemp = input.leitura("Quantidade do Produto: ");
									isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
								}
								if (variavelTemp.length()==0) {
									JOptionPane.showMessageDialog(null, "É preciso informar um valor", "ERRO", JOptionPane.ERROR_MESSAGE);
									variavelTemp = input.leitura("Quantidade do Produto: ");
									isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
								}
								if (variavelTemp.length()>3) {
									JOptionPane.showMessageDialog(null, "A quantidade não pode ultrapassar 3 casas decimais", "ERRO", JOptionPane.ERROR_MESSAGE);
									variavelTemp = input.leitura("Quantidade do Produto: ");
									isSomenteInteiro = (variavelTemp != null) && variavelTemp.matches("[0-9]*");
								}
								
							}
							
							int valorTemporario2 = Integer.parseInt(variavelTemp);
							
							quantProd.add(valorTemporario2);
												
							
							//===================VALOR TOTAL==================//
							valorTotal.add(valorTemporario * valorTemporario2);
							
							
							//=========PRODUTO CADASTRADO COM SUCESSO=========//
							JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
							//CONTINUAR?
							continuar = input.leitura("Deseja cadastrar mais algum produto?(S/N) ").toUpperCase().charAt(0);
							while (!(continuar=='S') && !(continuar=='N')) {
								continuar = input.leitura("Opção inválida. Informe (S/N) ").toUpperCase().charAt(0);
							}
						}
					}

					//=======================PESQUISAR PRODUTO==============================//
					
					if (op.equals("2")) {
						JOptionPane.showMessageDialog(null, "Em desenvolvimento, volte mais tarde!");
					}
					
					if (op.equals("3")) {
						JOptionPane.showMessageDialog(null, "Em desenvolvimento, volte mais tarde!");
					}
					
					//=========================EXCLUIR PRODUTO==============================//
					if (op.equals("4")) {
						excluirProduto = input.leitura("Informe o código do produto para excluí-lo: ");
						Boolean isSomenteInteiro = (excluirProduto!=null) && (excluirProduto.matches("[0-9]*"));
						
						while (!isSomenteInteiro) {
							excluirProduto = input.leitura("Código inválido. Informe um código com apenas números: ");
							isSomenteInteiro = (excluirProduto!= null) && excluirProduto.matches("[0-9]*");
						}
						
						
						excluirProdutoInt = Integer.parseInt(excluirProduto);
						
						if (!codigoProd.contains(excluirProdutoInt)) {
							JOptionPane.showMessageDialog(null, "Produto não cadastrado, não foi possível excluir", "ERRO", JOptionPane.ERROR_MESSAGE);
						}
						
							if (codigoProd.contains(excluirProdutoInt)) {
								indiceProduto = -50;
								for (int i = 0; i<=codigoProd.size()-1;i++) {
									if (codigoProd.get(i).equals(excluirProdutoInt)) {
										indiceProduto = i;
									}
								}
							
							codigoProd.remove(indiceProduto);
							nomeProd.remove(indiceProduto);
							universo.remove(indiceProduto);
							personagem.remove(indiceProduto);
							tipoProd.remove(indiceProduto);
							fornecedor.remove(indiceProduto);
							valorProd.remove(indiceProduto);
							quantProd.remove(indiceProduto);
							valorTotal.remove(indiceProduto);
							
							JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
							
							}
							
						
					}//=======EXCLUIR PRODUTO
					
				} while (!(op.equals("5")));

				
				menuPrincipal = "Voltar";
				
				
			}

			
//==========================================================================================================//
//==========================================================================================================//
//==========================================================================================================//
//==========================================MANTER CLIENTES=================================================//
//==========================================================================================================//
//==========================================================================================================//
//==========================================================================================================//
			
			if (menuPrincipal.equals("2")) {

				do {
					System.out.println();
					System.out.println("======================================");
					System.out.println("            MANTER CLIENTES");
					System.out.println("Cadastrar Cliente...........: 1"); // OK!
					System.out.println("Pesquisar Cliente...........: 2"); // OK!
					System.out.println("Editar Cliente..............: 3"); // OK!
					System.out.println("Excluir Cliente.............: 4"); // OK!
					System.out.println("Exibir Clientes.............: 5");
					System.out.println("Voltar ao menu Principal....: 6"); // OK!
					System.out.println();
					opcaoMenu = input.leitura("Digite uma das opções acima: ");

					while (!opcaoMenu.equals("1") && (!opcaoMenu.equals("2")
							&& (!opcaoMenu.equals("3") && (!opcaoMenu.equals("4") && (!opcaoMenu.equals("5") && (!opcaoMenu.equals("6"))))))) {
						opcaoMenu = input.leitura("Opção inexistente. Selecione outra opção: ");
					}

					switch (opcaoMenu) {

// ============================================CADASTRO DE CLIENTE===========================================//
					case "1":

						continuar = 'r';

						System.out.println("=========CADASTRO DE CLIENTE==========");
						
						String cpfTemp;
						String testeCPF;
						int repetido = 4;
						
						do {
							nome.add(input.leitura("Nome............: "));
							
							
							cpfTemp = input.leitura("CPF.............: ").replace(".", "").replace("-", "");
							Boolean isSomenteInteiro = ((cpfTemp != null) && cpfTemp.matches("[0-9]*"));
							while (!(isSomenteInteiro) || !(cpfTemp.length()==11)) {
								if (!(isSomenteInteiro)) {
									JOptionPane.showMessageDialog(null, "Informe um CPF com números", "ERRO", JOptionPane.ERROR_MESSAGE);
									cpfTemp = input.leitura("CPF.............: ");
									isSomenteInteiro = ((cpfTemp != null) && cpfTemp.matches("[0-9]*"));
								}
								
								for (int i = 0; i<=cpf.size()-1; i++) {
									testeCPF = cpf.get(i);
										while (testeCPF.equals(cpfTemp) || (!(cpfTemp.length()==11))) {
												if (!(cpfTemp.length()==11)) {
													JOptionPane.showMessageDialog(null, "O CPF precisa ter 11 dígitos", "ERRO", JOptionPane.ERROR_MESSAGE);
													cpfTemp = input.leitura("CPF.............: ").replace(".", "").replace("-", "");
													isSomenteInteiro = ((cpfTemp != null) && cpfTemp.matches("[0-9]*"));
												}
												if (testeCPF.equals(cpfTemp)) {
													JOptionPane.showMessageDialog(null, "CPF já cadastrado. Informe outro CPF", "ERRO", JOptionPane.ERROR_MESSAGE);
													cpfTemp = input.leitura("CPF.............: ").replace(".", "").replace("-", "");
													isSomenteInteiro = ((cpfTemp != null) && cpfTemp.matches("[0-9]*"));
												}
												
										}
								}
								
							}
								
							
							cpf.add(cpfTemp.replace(".", "").replace("-", ""));
							
							
						repetido = 4;
							
						//===========================================================//
							
							telefone.add(input.leitura("Telefone........: "));
							
							
							JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");

							do {
								continuar = input.leitura("Gostaria de cadastrar mais algum cliente?(S/N) ").toUpperCase()
										.charAt(0);
							} while (!(continuar == 'S') && (!(continuar == 'N')));

						} while (continuar == 'S');

						break;

// ============================================PESQUISAR CLIENTE=============================================//

					case "2": // PESQUISAR CLIENTE

						continuar = 'r';
						
						System.out.println("===================PESQUISAR CLIENTE========================");
						System.out.println("Você quer localizar o cliente por: ");
						System.out.println("Nome.....: 1");
						System.out.println("CPF......: 2");
						pesquisa = input.leitura("Escolha um número: ");
						
						Boolean isNumero = (pesquisa.equals("1") || pesquisa.equals("2"));
						
						while (!(isNumero)) {						
							JOptionPane.showMessageDialog(null, "Opção Inválida", "ERRO", JOptionPane.ERROR_MESSAGE);
							pesquisa = input.leitura("Escolha um número: ");
							isNumero = (pesquisa.equals("1") || pesquisa.equals("2"));							
						}			
						

						int index;
						char repetirNome = 'S';
						repetido = 0;
						
						
						if (pesquisa.equals("1")) {
							String pesquisaNome = input.leitura("Informe o Nome do cliente: ");
								
								//============NOME NÃO EXISTE========//
								while ((!nome.contains(pesquisaNome)) && repetirNome == 'S') {
									JOptionPane.showMessageDialog(null, "Cliente não cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
									repetido = -1;
									repetirNome = input.leitura("Gostaria de informar o nome novamente? (S/N): ").toUpperCase().charAt(0);
									
										while (!(repetirNome=='S') && !(repetirNome=='N')) {
											repetirNome = input.leitura("Opção incorreta. Responda (S/N): ").toUpperCase().charAt(0);
										}
									
									if (repetirNome=='S') {
										pesquisaNome = input.leitura("Informe o Nome do cliente: ");
									}else {
										menuPrincipal = "2";										
										break;
									}
										
								}
							
								
								
								//============NOMES REPETIDOS============//							
									for (int i = 0; i<=nome.size()-1;i++) {
										if (pesquisaNome.equals(nome.get(i))) {
											repetido = repetido + 1;
										}else {
											repetido = 0;
										}
									}

								
								if (repetido>1) {
										System.out.println();
										System.out.println("Clientes com o mesmo nome foram encontrados. Você gostaria de:");
										System.out.println("1 - Mostrar a lista dos clientes encontrados e selecioná-los por um número");
										System.out.println("2 - Pesquisar cliente pelo CPF");
										repetido = Integer.parseInt(input.leitura("Selecione um número: "));
											while (!(repetido==1) && (!(repetido==2))) {
													repetido = Integer.parseInt(input.leitura("Opção inválida, selecione outra opção: "));
												}
											if (repetido==1) {
													System.out.println();
														for (int i = 0; i<=nome.size()-1;i++) {
																if (nome.get(i).equals(pesquisaNome)) {
																	System.out.print(i + " - " + nome.get(i) + "  |  ");
																	System.out.print("CPF: " + cpf.get(i) + "  |  ");
																	System.out.println();
																}
														}
													index = Integer.parseInt(input.leitura("Escolha o número do cliente desejado: "));
													System.out.println();
													System.out.println("Nome........: " + nome.get(index));
													System.out.println("CPF.........: " + cpf.get(index));
													System.out.println("Telefone....: " + telefone.get(index));
																										
											}else {
												pesquisa = "2";
											}			
								}
								
								if (repetido==0 && (!(repetirNome == 'N'))) {
									index = nome.indexOf(pesquisaNome);
									System.out.println();
									System.out.println("Nome........: " + nome.get(index));
									System.out.println("CPF.........: " + cpf.get(index));
									System.out.println("Telefone....: " + telefone.get(index));
								}
								
							}
								
							//======================PESQUISA POR CPF===================//
							if (pesquisa.equals("2")) {								
									
									char digitarNovamente = 'S';
									String pesquisaCPF = "";
									
									
									while (digitarNovamente == 'S') {
									pesquisaCPF = input.leitura("Informe o CPF do cliente: ").replace(".", "").replace("-", "");
										if (!(cpf.contains(pesquisaCPF))) {										
											JOptionPane.showMessageDialog(null, "CPF não cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);
											digitarNovamente = input.leitura("Gostaria de digitar novamente? (S/N)").toUpperCase().charAt(0);
												while (!(digitarNovamente=='S') && (!(digitarNovamente=='N'))) {
													digitarNovamente = input.leitura("Opção incorreta. Responda (S/N): ").toUpperCase().charAt(0);
												}
										}else {
											if (cpf.contains(pesquisaCPF)) {
												index = cpf.indexOf(pesquisaCPF);
												System.out.println();
												System.out.println("Nome............: " + nome.get(index));
												System.out.println("CPF.............: " + cpf.get(index));
												System.out.println("Telefone........: " + telefone.get(index));
												break;
											}											
										}
									}
									
									if (digitarNovamente == 'N') {
										break;
									}

										
									}						
												
						break;

						

// =========================================EDITAR CLIENTE================================================//

					case "3":

						System.out.println("===================EDITAR CLIENTE========================");

						continuar = 'r';
						
						String editar_Cliente;
												
						editar_Cliente = input.leitura("Informe o CPF do Cliente: ").replace("-", "").replace(".",  "");
						Boolean isCPF = (editar_Cliente!=null && editar_Cliente.matches("[0-9]*"));
						
						while (!cpf.contains(editar_Cliente)) {
							JOptionPane.showMessageDialog(null, "Cliente não existe, informar um CPF válido", "ERRO", JOptionPane.ERROR_MESSAGE);
							editar_Cliente = input.leitura("Informe o CPF do Cliente: ").replace("-", "").replace("." , "");
							isCPF = (editar_Cliente!=null && editar_Cliente.matches("[0-9]*"));
						}
						
						index = cpf.indexOf(editar_Cliente);
						
						System.out.println();
						System.out.println("Nome.........: " + nome.get(index));
						System.out.println("CPF..........: " + cpf.get(index));
						System.out.println("Telefone.....: " + telefone.get(index));
												
						do {
							
							System.out.println();
							System.out.println("1 - Nome");
							System.out.println("2 - CPF");
							System.out.println("3 - Telefone");
							editarDado = input.leitura("Qual informação gostaria de editar: ");

							while ((!editarDado.equals("1")) && (!editarDado.equals("2")) && (!editarDado.equals("3"))) {
								JOptionPane.showMessageDialog(null, "Opção Incorreta", "ERRO", JOptionPane.ERROR_MESSAGE);
								editarDado = (input.leitura("Informe uma opção correta (entre 1 e 3): "));
							}

							if (editarDado.equals("1")) {
								nomeTroca = input.leitura("Informe o novo nome: ");
								nome.set(index, nomeTroca);
								JOptionPane.showMessageDialog(null, "Nome salvo com sucesso!");
							} else {
								if (editarDado.equals("2")) {
									System.out.println();
									cpfTroca = input.leitura("Informe o novo CPF: ").replace(".", "").replace("-", "");
									
									while (cpf.contains(cpfTroca) || (!(isCPF)) || (!(cpfTroca.length()==11))) {
										if (cpf.contains(cpfTroca)) {
											JOptionPane.showMessageDialog(null, "CPF já cadastrado. Informe outro CPF.", "ERRO", JOptionPane.ERROR_MESSAGE);											
										}
										if (!isCPF) {
											JOptionPane.showMessageDialog(null, "CPF inválido. Informe outro CPF.", "ERRO", JOptionPane.ERROR_MESSAGE);											
										}
										if (!(cpfTroca.length()==11) && isCPF) {
											JOptionPane.showMessageDialog(null, "O CPF precisa ter 11 dígitos", "ERRO", JOptionPane.ERROR_MESSAGE);											
										}
										cpfTroca = input.leitura("Informe o novo CPF: ").replace(".", "").replace("-", "");
										isCPF = cpfTroca!=null && cpfTroca.matches("[0-9]*");
									}
									
									cpf.set(index, cpfTroca);
									JOptionPane.showMessageDialog(null, "CPF salvo com sucesso!");
								} else {
									telefoneTroca = input.leitura("Informe o telefone: ");
									telefone.set(index, telefoneTroca);
									JOptionPane.showMessageDialog(null, "Telefone salvo com sucesso!");
								}
							}

							System.out.println();
							do {
								continuar = input.leitura("Gostaria de editar mais algum dado do cliente " + nome.get(index) + "?(S/N) ").toUpperCase().charAt(0);
							} while (!(continuar == 'S') && (!(continuar == 'N')));

						} while (continuar == 'S');

						break;

// ==============================================EXCLUIR CLIENTE===============================================//

					case "4":

						System.out.println("===================EXCLUIR CLIENTE========================");

						continuar = 'r';
						
						do {
						excluirCliente = input.leitura("Informe o CPF do cliente: ").replace(".", "").replace("-", "").replace(" ", "");
						Boolean isnumero = (excluirCliente!=null && excluirCliente.matches("[0-9]*"));
						while (!cpf.contains(excluirCliente) || (!isnumero) || (excluirCliente.length()!=11)) {
							if ((!isnumero) || excluirCliente.length()!=11) {
								JOptionPane.showMessageDialog(null, "CPF inválido, informe outro CPF", "ERRO", JOptionPane.ERROR_MESSAGE);								
							}
							if (!cpf.contains(excluirCliente) && excluirCliente.length()==11) {							
							JOptionPane.showMessageDialog(null, "Cliente não cadastrado, informe outro CPF.", "ERRO", JOptionPane.ERROR_MESSAGE);
							}
							excluirCliente = input.leitura("Informe o CPF do cliente: ").replace(".", "").replace("-", "").replace(" ", "");
							isnumero = (excluirCliente!=null && excluirCliente.matches("[0-9]*"));
						}
						
							index = cpf.indexOf(excluirCliente);							

							nome.remove(index);
							cpf.remove(index);
							telefone.remove(index);

							JOptionPane.showMessageDialog(null, "Cliente excluído");

							do {
								System.out.println();
								continuar = input.leitura("Gostaria de excluir mais algum cliente?(S/N) ").toUpperCase()
										.charAt(0);
							} while (!(continuar == 'S') && (!(continuar == 'N')));

						} while (continuar == 'S');

						break;

// ==============================================EXIBIR CLIENTES===============================================//
		
					case "5":
						
						continuar = 'r';
						
						index = nome.size();
						
						if (index==0) {
							JOptionPane.showMessageDialog(null, "Não há clientes cadastrados", "ERRO", JOptionPane.ERROR_MESSAGE);
						}else {
							Clientes();							
							
							for (int i = 0; i<index; i++) {							
							//======CÓDIGO======//
							while (i<999999999) {
								espaco = espaco + " ";
							}
							
							System.out.print(separador + (i+1) + espaco);
							
							//=======NOME======//
							
							espaco = " ";
							ultimoElemento = nome.get(i);
							while (ultimoElemento.length()<30) {
								espaco = espaco + " ";
							}
								
							System.out.print(separador + ultimoElemento + espaco);	
							
							//============CPF=========//
							
							ultimoElemento = cpf.get(i);
							while (ultimoElemento.length()<11) {
								espaco = espaco + " ";
							}
							
							System.out.print(separador + ultimoElemento + espaco);
							
							//========TELEFONE========//
														
							ultimoElemento = telefone.get(i);
							while (ultimoElemento.length()<15) {
								espaco = espaco + " ";
							}
							
							System.out.print(separador + ultimoElemento + espaco);
								
							
						}						
						
						}				
						
						break;
						
// =========================================SAIR DO MANTER CLIENTES==============================================//

					case "6":
						menuPrincipal = "Voltar";
					}

				} while (!(opcaoMenu.equals("6")));

			}

//==========================================================================================================//
//==========================================================================================================//
//==========================================================================================================//
//==========================================EXIBIR ESTOQUE==================================================//
//==========================================================================================================//
//==========================================================================================================//
//==========================================================================================================//

			if (menuPrincipal.equals("3")) {

				Gourmet();
				for (int i = 0; i < nomeProd.size(); i++) {

					

					// ==============CÓDIGO===============//OK!

					espaco = " ";
					
					ultimoElemento = String.valueOf(codigoProd.get(i));

					while (ultimoElemento.length() + espaco.length() + separador.length() < 11) {
						espaco = espaco + " ";
					}

					System.out.print(separador + codigoProd.get(i) + espaco);

					// ==============NOME================//OK!
					
					espaco = " ";
					
					ultimoElemento = nomeProd.get(i);

					while (ultimoElemento.length() + espaco.length() + separador.length() <28) {
						espaco = espaco + " ";
					}

					System.out.print(separador + nomeProd.get(i) + espaco);

					// =============UNIVERSO============//OK!

					espaco = " ";
					
					ultimoElemento = universo.get(i);

					while (ultimoElemento.length() + espaco.length() + separador.length() < 15) {
						espaco = espaco + " ";
					}

					System.out.print(separador + universo.get(i) + espaco);

					// ============PERSONAGEM===========//OK!

					espaco = " ";
					
					ultimoElemento = personagem.get(i);

					while (ultimoElemento.length() + espaco.length() + separador.length() < 19) {
						espaco = espaco + " ";
					}

					System.out.print(separador + personagem.get(i) + espaco);

					// ===========TIPO PRODUTO=========//OK!

					espaco = " ";
					
					ultimoElemento = tipoProd.get(i);

					while (ultimoElemento.length() + espaco.length() + separador.length() < 18) {
						espaco = espaco + " ";
					}

					System.out.print(separador + tipoProd.get(i) + espaco);

					// ===========FORNECEDOR==========//OK!

					espaco = " ";
					
					ultimoElemento = fornecedor.get(i);

					while (ultimoElemento.length() + espaco.length() + separador.length() < 17) {
						espaco = espaco + " ";
					}

					System.out.print(separador + fornecedor.get(i) + espaco);

					// ============VALOR UNITÁRIO========//OK!

					espaco = " ";

					ultimoElemento = String.valueOf(valores.format(valorProd.get(i)));

					while (ultimoElemento.length() + espaco.length() + realzin.length() + separador.length() < 17) {
						espaco = espaco + " ";
					}

					System.out.print(separador + realzin + valores.format(valorProd.get(i)) + espaco);

					// ==============QUANT.PRODUTO===========//OK!
					// = espaços normais

					espaco = " ";

					ultimoElemento = String.valueOf(quantProd.get(i));

					while (ultimoElemento.length() + espaco.length() + separador.length() < 13) {
						espaco = espaco + " ";
					}

					System.out.print(separador + quantProd.get(i) + espaco);

					// ===============VALOR TOTAL===============//OK!

					espaco = " ";

					ultimoElemento = String.valueOf(valores.format(valorTotal.get(i)));

					while (separador.length() + realzin.length() + ultimoElemento.length() + espaco.length() < 18) {
						espaco = espaco + " ";
					}

					System.out.print(separador + realzin + valores.format(valorTotal.get(i)) + espaco);

					// ===============SITUAÇÃO=================//OK!

					espaco = " ";

					if (quantProd.get(i) < 10) {
						condicao = "REPOR";
					} else {
						condicao = "OK!";
					}

					situacao.add(i, condicao);

					while (condicao.length() + espaco.length() + separador.length() + separador.length() < 12) {
						espaco = espaco + " ";
					}

					System.out.print(separador + situacao.get(i) + espaco + separador);

					/// =========SALTO DE LINHA===========//

					System.out.println();

				}
				System.out.println(
						" =======================================================================================================================================================================");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();

				menuPrincipal = "Voltar";

			}

//=============================================SAIR DO SISTEMA=============================================//

		} while (!menuPrincipal.equals("1") && !menuPrincipal.equals("2") && !menuPrincipal.equals("3")
				&& !menuPrincipal.equals("4"));

		System.out.println("\n");
		System.out.println("**********************************************************");
		System.out.println("*  Obrigado(a) por usar o sistema Power Geek!            *");
		System.out.print("*  Desenvolvedores: Fausto Aquino Neto                   *\n");
		System.out.println("*                   Guilherme Gutierre Oliveira Santos   *");
		System.out.println("*                   Gustavo Siqueira Gualberto           *");
		System.out.println("*                   Karoline Vitória Matteucci Faria     *");
		System.out.println("*  Professor: Roussian Di Ranos Alves Gaioso             *");
		System.out.println("*********************************************************");

	}

	public static void Gourmet() {
		System.out.println();
		System.out.println();
		System.out.println(
				" ======================================================================================================================================================================");
		System.out.println(
				"|                                                                    ESTOQUE                                                                                           |");
		System.out.println(
				" ======================================================================================================================================================================");
		System.out.println(
				"|Código    | Nome                      |   Universo   |    Personagem    | Tipo de Produto |   Fornecedor   | Valor Unitário | Quantidade |   Valor Total   | Situação |");
		System.out.println(
				" =======================================================================================================================================================================");
	}
	
	public static void Clientes() {
		System.out.println();
		System.out.println();
		System.out.println(" =======================================================================================================================");
		System.out.println("|                                                            CLIENTES                                                   |");
		System.out.println(" =======================================================================================================================");
		System.out.println("|Código   | Nome                        |    CPF    |    Telefone   |                Preferências                       |");
		System.out.println("|                                                                   |   Universo   |    Personagem    | Tipo de Produto |");
		System.out.println(" =======================================================================================================================");
	}
}
