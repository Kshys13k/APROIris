import java.util.ArrayList;
import java.util.List;

/**
 * Class that provides methods to analyze data
 */
public class DataSetOperations {
    public void print(List<Record> data){
        System.out.println("Id,SepalLengthCm,SepalWidthCm,PetalLengthCm,PetalWidthCm,Species");
        for(int i=0;i< data.size();i++){
            System.out.println(data.get(i).getID()+ ", "+data.get(i).getSepalLengthCm()+ ", "+data.get(i).getSepalWidthCm()+ ", "+data.get(i).getPetalLengthCm()+ ", "+data.get(i).getPetalWidthCm() + ", "+data.get(i).getSpecies());
        }
    }

    /**
     * counts arithmetic average of elements in given column
     * @param data
     * @param columnNumber
     * @return
     */
    public float arithmeticAverage(List<Record> data, int columnNumber){
        int i;
        float sum=0;
        switch (columnNumber){
            case 1 : for(i=0;i< data.size();i++){
                sum+=data.get(i).getSepalLengthCm();
            }
                break;
            case 2 : for(i=0;i< data.size();i++){
                sum+=data.get(i).getSepalWidthCm();
            }
                break;
            case 3 : for(i=0;i< data.size();i++){
                sum+=data.get(i).getPetalLengthCm();
            }
                break;
            case 4 : for(i=0;i< data.size();i++){
                sum+=data.get(i).getPetalWidthCm();
            }
            break;
            default:return 0;
        }
        return sum/i;
    }

    /**
     *  counts arithmetic average of elements in given column for given species
     * @param data
     * @param columnNumber
     * @param species
     * @return
     */
    public float arithmeticAverageForGivenSpecies(List<Record> data, int columnNumber, String species){
        int i;
        float sum=0;
        switch (columnNumber){
            case 1 : for(i=0;i< data.size();i++){
                if(data.get(i).getSpecies().equals(species)) sum+=data.get(i).getSepalLengthCm();
            }
                break;
            case 2 : for(i=0;i< data.size();i++){
                if(data.get(i).getSpecies().equals(species)) sum+=data.get(i).getSepalWidthCm();
            }
                break;
            case 3 : for(i=0;i< data.size();i++){
                if(data.get(i).getSpecies().equals(species)) sum+=data.get(i).getPetalLengthCm();
            }
                break;
            case 4 : for(i=0;i< data.size();i++){
                if(data.get(i).getSpecies().equals(species)) sum+=data.get(i).getPetalWidthCm();
            }
                break;
            default:return 0;
        }
        return sum/i;
    }

    /**
     * counts median of elements in given column
     * @param data
     * @param columnNumber
     * @return
     */
    public float median(List<Record> data, int columnNumber){
        List<Float> list=getColumn(data,columnNumber);
        list=bubbleSort(list);
        if(list.size()%2==1) return list.get((list.size()-1)/2);
        else{
            return ((list.get(list.size()/2)+(list.get((list.size()-2)/2)))/2);
        }
    }

    /**
     * counts median of elements in given column for given species
     * @param data
     * @param columnNumber
     * @param species
     * @return
     */
    public float medianForGivenSpecies(List<Record> data, int columnNumber, String species){
        List<Float> list=getColumnForGivenSpecies(data,columnNumber, species);
        list=bubbleSort(list);
        if(list.size()%2==1) return list.get((list.size()-1)/2);
        else{
            return ((list.get(list.size()/2)+(list.get((list.size()-2)/2)))/2);
        }
    }

    /**
     * returns the greatest element in given column
     * @param data
     * @param columnNumber
     * @return
     */
    public float maxFloat(List<Record> data, int columnNumber){
        List <Float> list=getColumn(data, columnNumber);
        list=bubbleSort(list);
        float max=0;
        for(int i=0;i< list.size();i++){
            if(list.get(i)>max) max= list.get(i);
        }
        return max;
    }

    /**
     * returns the greatest element in given column for given species
     * @param data
     * @param columnNumber
     * @param species
     * @return
     */
    public float maxFloatForGivenSpecies(List<Record> data, int columnNumber, String species){
        List <Float> list=getColumnForGivenSpecies(data, columnNumber, species);
        list=bubbleSort(list);
        float max=0;
        for(int i=0;i< list.size();i++){
            if(list.get(i)>max) max= list.get(i);
        }
        return max;
    }

    /**
     * returns the smallest element in given column
     * @param data
     * @param columnNumber
     * @return
     */
    public float minFloat(List<Record> data, int columnNumber){
        List <Float> list=getColumn(data, columnNumber);
        list=bubbleSort(list);
        float min=1000000;
        for(int i=0;i< list.size();i++){
            if(list.get(i)<min) min= list.get(i);
        }
        return min;
    }

    /**
     * returns the smallest element in given column for given species
     * @param data
     * @param columnNumber
     * @param species
     * @return
     */
    public float minFloatForGivenSpecies(List<Record> data, int columnNumber, String species){
        List <Float> list=getColumnForGivenSpecies(data, columnNumber, species);
        list=bubbleSort(list);
        float min=1000000;
        for(int i=0;i< list.size();i++){
            if(list.get(i)<min) min= list.get(i);
        }
        return min;
    }

    /**
     * return number of record where species name occurs
     * @param data
     * @param species
     * @return
     */
    public int appearancesCounter(List<Record> data, String species){
        int counter=0;
        for(int i=0;i<data.size();i++){
            if(data.get(i).getSpecies().equals(species)) counter++;
        }
        return counter;
    }

    /**
     * bubbleSort algorithm
     * @param list
     * @return
     */
    private List<Float> bubbleSort(List<Float> list){
        float temp;
        boolean swapped;
        for(int i=0;i<list.size()-1;i++){
            swapped=false;
            if(list.get(i)> list.get(i+1)){
                temp=list.get(i);
                list.set(i,list.get(i+1));
                list.set(i+1,temp);
                swapped=true;
            }
            if(!swapped) break;
        }
        return list;
    }

    /**
     * returns list of floats from one column
     * @param data
     * @param columnNumber
     * @return
     */
    private List<Float> getColumn(List <Record> data, int columnNumber){
        int i;
        List<Float> list= new ArrayList<>();
        switch (columnNumber){
            case 1 : for(i=0;i< data.size();i++){
                list.add((float) data.get(i).getSepalLengthCm());
            }
                break;
            case 2 : for(i=0;i< data.size();i++){
                list.add((float) data.get(i).getSepalWidthCm());
            }
                break;
            case 3 : for(i=0;i< data.size();i++){
                list.add((float) data.get(i).getPetalLengthCm());
            }
                break;
            case 4 : for(i=0;i< data.size();i++){
                list.add((float) data.get(i).getPetalWidthCm());
            }
            break;
            default: throw new IndexOutOfBoundsException("Column must be an integer in interval <1;4>");
        }
        return list;
    }

    /**
     * returns list of floats from one column and only from records which contains given species name
     * @param data
     * @param columnNumber
     * @param species
     * @return
     */
    private List<Float> getColumnForGivenSpecies(List <Record> data, int columnNumber, String species){
        int i;
        List<Float> list= new ArrayList<>();
        switch (columnNumber){
            case 1 : for(i=0;i< data.size();i++){
                if(data.get(i).getSpecies().equals(species)) list.add((float) data.get(i).getSepalLengthCm());
            }
                break;
            case 2 : for(i=0;i< data.size();i++){
                if(data.get(i).getSpecies().equals(species)) list.add((float) data.get(i).getSepalWidthCm());
            }
                break;
            case 3 : for(i=0;i< data.size();i++){
                if(data.get(i).getSpecies().equals(species)) list.add((float) data.get(i).getPetalLengthCm());
            }
                break;
            case 4 : for(i=0;i< data.size();i++){
                if(data.get(i).getSpecies().equals(species)) list.add((float) data.get(i).getPetalWidthCm());
            }
                break;
            default: throw new IndexOutOfBoundsException("Column must be an integer in interval <1;4>");
        }
        return list;
    }
}
