class ArvoreBinaria {
    private BIntNo raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int novoValor) {
        raiz = inserir(raiz, novoValor);
    }

    private BIntNo inserir(BIntNo arvore, int novoNo) {
        if (arvore == null) {
            return new BIntNo(novoNo);
        } else {
            if (novoNo < arvore.valor) {
                arvore.esq = inserir(arvore.esq, novoNo);
            } else {
                arvore.dir = inserir(arvore.dir, novoNo);
            }
        }
        return arvore;
    }

    public void exibirNo() {
        exibirEsquerdo(raiz);
        exibirRaiz();
        exibirDireito(raiz);
    }

    private void exibirEsquerdo(BIntNo arv) {
        if (arv != null) {
            exibirEsquerdo(arv.esq);
            System.out.print(arv.valor + " ");
        }
    }

    private void exibirDireito(BIntNo arv) {
        if (arv != null) {
            System.out.print(arv.valor + " ");
            exibirDireito(arv.dir);
        }
    }

    private void exibirRaiz() {
        if (raiz != null) {
            System.out.println("Raiz: " + raiz.valor);
        }
    }

    public void remover(int item) {
        raiz = remover(raiz, item);
    }

    private BIntNo remover(BIntNo arvore, int item) {
        if (arvore == null) {
            System.out.println("Item não localizado!");
            return null;
        }

        if (item < arvore.valor) {
            arvore.esq = remover(arvore.esq, item);
        } else if (item > arvore.valor) {
            arvore.dir = remover(arvore.dir, item);
        } else {
            if (arvore.esq == null) {
                return arvore.dir;
            } else if (arvore.dir == null) {
                return arvore.esq;
            }

            BIntNo temp = arvore.dir;
            while (temp.esq != null) {
                temp = temp.esq;
            }
            arvore.valor = temp.valor;
            arvore.dir = remover(arvore.dir, temp.valor);
        }
        return arvore;
    }
}
