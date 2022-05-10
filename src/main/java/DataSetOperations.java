import java.util.ArrayList;
import java.util.List;

public class DataSetOperations {
    public void print(List<Record> data){
        System.out.println("Id,SepalLengthCm,SepalWidthCm,PetalLengthCm,PetalWidthCm,Species");
        for(int i=0;i< data.size();i++){
            System.out.println(data.get(i).getID()+ ", "+data.get(i).getSepalLengthCm()+ ", "+data.get(i).getSepalWidthCm()+ ", "+data.get(i).getPetalLengthCm()+ ", "+data.get(i).getPetalWidthCm() + ", "+data.get(i).getSpecies());
        }
    }

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

    public float median(List<Record> data, int columnNumber){
        List<Float> list=getColumn(data,columnNumber);
        list=bubbleSort(list);
        if(list.size()%2==1) return list.get((list.size()-1)/2);
        else{
            return ((list.get(list.size()/2)+(list.get((list.size()-2)/2)))/2);
        }
    }
    public float medianForGivenSpecies(List<Record> data, int columnNumber, String species){
        List<Float> list=getColumnForGivenSpecies(data,columnNumber, species);
        list=bubbleSort(list);
        if(list.size()%2==1) return list.get((list.size()-1)/2);
        else{
            return ((list.get(list.size()/2)+(list.get((list.size()-2)/2)))/2);
        }
    }

    public float maxFloat(List<Record> data, int columnNumber){
        List <Float> list=getColumn(data, columnNumber);
        list=bubbleSort(list);
        float max=0;
        for(int i=0;i< list.size();i++){
            if(list.get(i)>max) max= list.get(i);
        }
        return max;
    }

    public float maxFloatForGivenSpecies(List<Record> data, int columnNumber, String species){
        List <Float> list=getColumnForGivenSpecies(data, columnNumber, species);
        list=bubbleSort(list);
        float max=0;
        for(int i=0;i< list.size();i++){
            if(list.get(i)>max) max= list.get(i);
        }
        return max;
    }

    public float minFloat(List<Record> data, int columnNumber){
        List <Float> list=getColumn(data, columnNumber);
        list=bubbleSort(list);
        float min=1000000;
        for(int i=0;i< list.size();i++){
            if(list.get(i)<min) min= list.get(i);
        }
        return min;
    }

    public float minFloatForGivenSpecies(List<Record> data, int columnNumber, String species){
        List <Float> list=getColumnForGivenSpecies(data, columnNumber, species);
        list=bubbleSort(list);
        float min=1000000;
        for(int i=0;i< list.size();i++){
            if(list.get(i)<min) min= list.get(i);
        }
        return min;
    }

    public int appearancesCounter(List<Record> data, String species){
        int counter=0;
        for(int i=0;i<data.size();i++){
            if(data.get(i).getSpecies().equals(species)) counter++;
        }
        return counter;
    }

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
