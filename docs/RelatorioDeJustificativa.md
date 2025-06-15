# Relatório de Justificativa dos Padrões de Projeto para Sistema de Gerenciamento de Pedidos

## Descrição do Sistema
O sistema gerencia pedidos para uma rede de restaurantes, incluindo geração de relatórios, comunicação com APIs externas, configuração de mesas, temas de interface e configuração global.

## Justificativa dos Padrões Escolhidos

### 1. Geração de Relatórios - Factory Method
- **Prós:** Facilita a criação de objetos de diferentes formatos sem modificar o código cliente; aumenta a extensibilidade.
- **Contras:** Pode aumentar o número de classes; pode levar a “God Factory” se mal gerenciado.
- **Benefícios:** Melhora a manutenibilidade e testabilidade, isolando a criação de relatórios.

### 2. Montagem de Requisição HTTP - Builder
- **Prós:** Excelente para objetos complexos com múltiplos parâmetros opcionais; permite construção passo a passo.
- **Contras:** A implementação pode ser mais verbosa.
- **Benefícios:** Facilita configuração dinâmica e reduz erros na criação do objeto.

### 3. Clonagem de Configurações de Mesa - Prototype
- Usado para copiar objetos existentes, evitando recriação complexa.

### 4. Temas de Interface - Abstract Factory
- Para agrupar famílias de componentes relacionados (botões, cores, ícones) sem expor suas classes concretas.

### 5. Configuração Global - Singleton
- Garante uma única instância de configuração acessível globalmente.

## Reflexão sobre Armadilhas
- “God Factory” pode ocorrer se Factory Method gerar muitas variações sem organização.
- Overengineering com padrões pode ser evitado aplicando-os apenas quando justificável.

## Sugestões Futuras
- Combinar Abstract Factory com Builder para cenários complexos de UI e configuração.
- Avaliar o uso de Dependency Injection para melhorar testabilidade.

## Referências Bibliográficas
- Gamma, Helm, Johnson, Vlissides. *Design Patterns: Elements of Reusable Object-Oriented Software*. Addison-Wesley, 1994.
- Documentação oficial Java.
- Artigos acadêmicos sobre padrões de projeto.
