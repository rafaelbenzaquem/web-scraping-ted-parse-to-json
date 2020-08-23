import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ConverterToJson {

    public static void main(String[] args) {
        String author = "Isabela Câmara";
        String body = "Atualmente, os carros autônomos são alvo de muita curiosidade e, de acordo com João Paulo Navarro, arquiteto de soluções com foco em Deep Learning e computação de alto-desempenho da NVIDIA, suas vantagens falam por si só. Diferente dos humanos, o carro autônomo é capaz de pensar com mais agilidade e tomar decisões de forma rápida, enxerga de modo periférico e não enfrenta os principais obstáculos do trânsito – cansaço, distração, imprudência e consumo de álcool causam a morte de cerca de 1,25 milhão de pessoas todos os anos no mundo, de acordo com a Organização Mundial da Saúde.\n" +
                "\n" +
                "Frente a esse cenário, João Paulo acredita que o carro autônomo é a resposta para resolver o problema do trânsito. Porém, antes de colocar os veículos para rodarem nas ruas, é necessário treinar a máquina com base no mais novo programa de rede neural, o deep learning, que se assemelha a um cérebro humano. A ideia dessa nova tecnologia é fazer com que o carro visualiza o mundo real e reconhece obstáculos no meio do caminho antes de tomar qualquer decisão. “Mas não é somente ver, é entender o que está por trás daquilo para tomar decisões mais seguras. Uma imagem é composta de reflexos de luz, representados no computador em forma de número, mas, se eu quero identificar que determinado objeto é uma pessoa eu preciso extrair o sentido por trás da imagem, e o número não é o suficiente”, explica Navarro no Mobility Day 2018.\n" +
                "\n" +
                "“Se queremos máquinas para pensar, precisamos ensiná-las a ver”, disse Fei-Fei Li, uma das principais cientistas da Universidade de Stanford – e João Paulo revela que é nesta frase que está a verdadeira essência do deep learning. Diferente de uma tecnologia de reconhecimento visual tradicional, a deep learning permite que a máquina aprenda novos objetos a partir de um treinamento, o que a faz realmente enxergar. “Algoritmos baseados em regra não são a solução para os carros autônomos”, afirma. Para ele, “não basta identificar itens classificados por uma forma padrão de cachorro”, por exemplo, porque no mundo real eles não estarão visíveis de uma forma padronizada, “são infinitas combinações de cachorros que a máquina precisa reconhecer”, explica.\n" +
                "\n" +
                "Por outro lado, com a deep learning, os engenheiros não precisaram descrever todas as características de um cachorro. “Eles passarão imagens para a máquina e ela aprenderá quais são os padrões fundamentais da imagem para, futuramente, identificá-los em outras situações de uma maneira curada”, explica. Dessa forma, os carros autônomos serão dotados de um “cérebro”, o que os tornará capazes de discernir se será necessário diminuir a velocidade devido a um cachorro em potencial no meio da rua ou seguir seu caminho caso o animal esteja fora de sua rota.\n" +
                "\n" +
                "Carros autônomos e deep learning no Brasil\n" +
                "Atualmente, já existem diversos projetos no Brasil envolvendo a construção de carros autônomos – a maioria das iniciativas, apesar dos cortes que o governo fez em verbas para pesquisa e ciência, acontecem dentro das próprias universidades, diz Navarro. O Iara (Intelligent Autonomous Robotic Automobile) nasceu de um projeto da Universidade Federal do Espírito Santo e, hoje, é um dos primeiros veículos autônomos brasileiros a trafegar em vias urbanas e em rodovias.\n" +
                "\n" +
                "De acordo com o arquiteto da NVIDIA, apesar dos projetos brasileiros estarem se tornando realidade, ainda serão necessários de 5 a 10 anos para que um carro autônomo saia do meio acadêmico e seja implantado em larga escala no país. Um dos grandes obstáculos – e causadores dessa demora relativa -, segundo ele, é em relação às especificidades do mercado brasileiro. “Trazer fabricantes e empresas com interesse em desenvolver carros autônomos aqui é o grande desafio. Um veículo autônomo treinado para as estradas da Califórnia, não é o ideal para o Brasil. Precisamos desenvolver a tecnologia aqui, trazendo o mercado ou gerando empresas no próprio país para montar um modelo adequado a nossa realidade”, conclui.";
        String title ="Deep Learning - conheça o cérebro dos carros autônomos";
        String type = "article";
        String url ="https://www.startse.com/noticia/startups/mobtech/deep-learning-o-cerebro-dos-carros-autonomos";

        Json json = new Json(author,body,title,type,url);

        try {
            File arquivo = new File("./" + title + ".json");

            if (!arquivo.exists()) {
                //cria um arquivo (vazio)
                arquivo.createNewFile();
            }
            //escreve no arquivo
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(new Gson().toJson(new Json(author, body, title, "video", url)));
            bw.newLine();
            bw.close();
            fw.close();
        }catch (Exception ex){

        }

    }
}
