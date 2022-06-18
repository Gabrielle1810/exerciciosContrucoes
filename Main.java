import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);  

    //Exercício 1:
    System.out.println("Exercício 1:");
    System.out.println("Informe dois números para saber qual deles é o maior.");
    System.out.println("Digite o primeiro número:");
    double nroA, nroB;
    nroA = ent.nextDouble();
    System.out.println("Digite o segundo número:");
    nroB = ent.nextDouble();
    if (nroA == nroB)
      System.out.println(nroA + " é igual a " + nroB);
    else
      if (nroA > nroB)   System.out.println(nroA + " é maior do que " + nroB);
      else 
        System.out.println(nroB + " é maior do que " + nroA);
    System.out.println("");
    System.out.println("");
    
    //Exercício 2:
    System.out.println("Exercício 2:");
    System.out.println("Informe um valor para saber se é um número positivo ou negativo:");
    double nroInformado;
    nroInformado = ent.nextDouble();
    if (nroInformado >= 0)
      System.out.println("O valor informado é positivo.");
    else
      System.out.println("O valor informado é negativo.");
    System.out.println("");
    System.out.println("");

    // Exercício 3:
    System.out.println("Exercício 3:");
    char sexo;
    System.out.println("Informe seu sexo: ");
    System.out.println("m = masculino, f = feminino");
    sexo = ent.next().charAt(0);
    if (sexo == 'm')
      System.out.println("Seu sexo é masculino!");
    else if (sexo == 'f')
      System.out.println("Seu sexo é feminino!");
      else 
      System.out.println("Sexo Inválido!");
    System.out.println("");
    System.out.println("");
    
    // Exercício 4:
    System.out.println("Exercício 4:");
    System.out.println("Informe as notas das parciais do aluno desejado:");
    double nota1, nota2, media;
    System.out.println("Informe a nota da primeira parcial:");  
    nota1 = ent.nextDouble();
    System.out.println("Informe a nota da segunda parcial:");
    nota2 = ent.nextDouble();
    media = (nota1 + nota2)/2;
    if (nota1 > 10 || nota2 > 10 || nota1 < 0 || nota2 < 0)
      System.out.println("As notas possuem valor máximo de 10, portanto informe um valor válido, ou seja, entre 0 e 10 em cada parcial.");
    else
      if (media >= 7) {
        if (media == 10)
        System.out.println("Parabéns! O Aluno foi aprovado com Distinção!");
        else
        System.out.println("Parabéns! O Aluno foi aprovado!");
        }
      else 
        System.out.println("O Aluno foi reprovado.");
    System.out.println("");
    System.out.println("");
    
    //Exercício 5:
    System.out.println("Exercício 5:");
    System.out.println("Informe três números para saber qual é o maior deles:");
    double x, y, z, nro;
    System.out.println("Informe o primero número:");
    x = ent.nextDouble();
    System.out.println("Informe o segundo número:");
    y = ent.nextDouble();
    System.out.println("Informe o terceiro número:");
    z = ent.nextDouble();
    if (x > y)
      nro = x;
    else 
      nro = y;
    if (nro > z)
      System.out.println("O maior número dentre os informados é " + nro);
    else 
      System.out.println("O maior número é " + z);
    System.out.println("");
    System.out.println("");  

    //Exercício 6:
    System.out.println("Exercício 6:");
    System.out.println("Digite três números para saber qual é o maior e qual é o menor dentre eles:");
    double menor = 0, maior = 0;
    System.out.println("Informe o primeiro número:");
    double a = ent.nextDouble();
    System.out.println("Informe o segundo número:");
    double b = ent.nextDouble();
    System.out.println("Informe o terceiro número:");
    double c = ent.nextDouble();

    if (a>b && a>c)
      maior = a;
    else if (a<b && a<c)
      menor = a;

    if (b>a && b>c)
      maior = b;
    else if (b<a && b<c)
      menor = b;

    if (c>a && c>b)
      maior = c;
    else if (c<a && c<b)
      menor = c;
     System.out.println("O maior número é: " + maior + ". O menor número é: " + menor);
    System.out.println("");
    System.out.println(""); 
    
    //Exercício 7:
    System.out.println("Exercício 7:");
    System.out.println("Informe três números para saber qual é a ordem decrescente deles: ");
    double decA = 0, decB = 0, decC = 0;
    System.out.println("Digite o primeiro número:");
    double d = ent.nextDouble();
    System.out.println("Digite o segundo número:");
    double e = ent.nextDouble();
    System.out.println("Digite o terceiro número:");
    double f = ent.nextDouble();
   
    if (d>f && d>e)
      decA = d;
    else if (d<f && d<e)
      decC = d;
      else 
        decB = d;

    if (f>d && f>e)
      decA = f;
    else if (f<d && f<e)
      decC = f;
      else 
        decB = f;
    
    if (e>f && e>d)
      decA = e;
    else if (e<f && e<d)
      decC = e;
        else 
        decB = e;
    
  System.out.println("A ordem decrescente dos números informados é: " + decA + ", " + decB + ", " + decC);
    System.out.println("");
    System.out.println("");
    
    //Exercício 8:
    /* O exercício não foi claro em relção aos salários R$700,00 e R$1.500,00, portanto coloquei eles sempre no menor percentual de aumento. 
    */
     System.out.println("Exercício 8:");
     System.out.println("Para saber qual o seu salário após o reajuste, informe seu salário atual:");
    double salario, reajuste = 0, valorAumentado, novoSalario;
    salario = ent.nextDouble();
    if (salario <= 280.00)
      reajuste = 0.2;
      else if (salario > 280.00 && salario < 700.00)
       reajuste =  0.15;
        else if (salario >= 700.00 && salario < 1500.00)
         reajuste = 0.1;
           else if (salario >= 1500.00)
           reajuste = 0.05;
    valorAumentado = salario * reajuste;
    novoSalario = salario + valorAumentado;
    System.out.println("O seu salário antes do reajuste era de: " + salario + ". Desse modo, seu percentual de aumento é de " + reajuste*100 + "%, logo seu salário aumentou em R$" + valorAumentado + ", sendo seu novo salário de R$" + novoSalario);    
  System.out.println(""); 
  System.out.println("");
    
    //Exercício 9:
    System.out.println("Exercício 9:");
    System.out.println("Informe as notas das parciais obtidas pelo aluno desejado:");
    double notaSemestre1, notaSemestre2, mediaSemestres;
    System.out.println("Informe a nota da primeira parcial:");  
    notaSemestre1 = ent.nextDouble();
    System.out.println("Informe a nota da segunda parcial:");
    notaSemestre2 = ent.nextDouble();
    mediaSemestres = (notaSemestre1 + notaSemestre2)/2;
  
    if (notaSemestre1 > 10 || notaSemestre1 < 0 || notaSemestre2 > 10 || notaSemestre2 < 0)
      System.out.println("As notas possuem valor máximo de 10, portanto informe um valor entre 0 e 10 em cada parcial.");
      else if (mediaSemestres >= 9 && mediaSemestres <=10)
        System.out.println("Parabéns. O conceito do aluno foi A!");
        else if (mediaSemestres >= 7.5 && mediaSemestres <9)
          System.out.println("O conceito do aluno foi B!");
          else if (mediaSemestres >= 6 && mediaSemestres <7.5)
              System.out.println("O conceito do aluno foi C!");
            else if (mediaSemestres >= 4 && mediaSemestres <6)
                System.out.println("O conceito do aluno foi D!");
              else if (mediaSemestres >= 0 && mediaSemestres <4)
                System.out.println("O conceito do aluno foi E!");
    System.out.println(""); 
    System.out.println("");

    //Exercício 10:
    int valor, ced100 = 0, ced50=0, ced20=0, ced10=0, ced5=0, ced1=0;
      boolean test=false;
        System.out.println("Informe o valor que deseja sacar: ");
        valor=ent.nextInt();
        if(valor>=10 && valor<=600){
        do{
        if(valor>=100){
            valor-=100;
            ced100++;
        }else{
            if(valor>=50){
            valor-=50;
            ced50++;
        }else{
                if(valor>=20){
                   valor-=20;
                   ced20++;
                }else{
                    if(valor>=10){
                        valor-=10;
                        ced10++;
                    }else{
                        if(valor>=5){
                            valor-=5;
                            ced5++;
                        }else{
                            if(valor>=1){
                                valor-=1;
                                ced1++;
                            }else{
                             valor-=valor;
                             test=true;
                            }
                        }
                }
            }
            }
        }
        if(valor==0){
            test=true;
        }
        }while(test==false);
            System.out.println("Notas sacadas:");
            System.out.println("R$100: "+ced100);
            System.out.println("R$50 : "+ced50);
            System.out.println("R$20 : "+ced20);
            System.out.println("R$10 : "+ced10);
            System.out.println("R$5  : "+ced5);
            System.out.println("R$1  : "+ced1);
    }else{
            System.out.println("Não é possivel sacar valores abaixo de R$10 ou valores acima de R$600.");
        }
  }
}