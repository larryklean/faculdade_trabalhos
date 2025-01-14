package br.univali.kob.poo1.aula07;

/**
 * Classe representando Estado
 * @author Mauricio
 */
public final class State {
    
    /**
     * Nome do estado
     */
    private final String name;
    
    /**
     * Sigla do estado
     */
    private final String abbreviation;
    
    /**
     * Constructor
     * @param name Nome do estado
     * @param abbreviation Abreviação do nome do estado
     */
    public State(String name, String abbreviation)
    {
        StringValidator val = new StringValidator();
        val.minWordsCount(name, 1);
        val.maxWordsCount(abbreviation, 1);
        this.name = name;
        this.abbreviation = abbreviation;
    }
    
    /**
     * Getter
     * @return Nome da compania
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Getter
     * @return Abreviação do nome da compania
     */
    public String getAbbreviation()
    {
        return this.abbreviation;
    }
    
    /**
     * Método sobrescrito equals
     * @param obj Objeto a ser comparado
     * @return true se igual 
     *         false se diferente
     */
    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        State state = (State)obj;
        
        return
                name.equals(state.name) && abbreviation.equals(state.abbreviation);
    }

    /**
     * Método sobrescrito hashcode
     * @return Valor correspondente ao hashcode do objeto
     */
    @Override
    public int hashCode() {
        return (name.hashCode()) ^ (abbreviation.hashCode());
    }
    
    /**
     * Retorna uma string representando as informações da classe
     * @return String com informações da classe
     */
    @Override
    public String toString()
    {
        return "\nEstado:\nNome: " + name + "\nAbreviacao: " + abbreviation;
    }
}
