public class Computer
{
    private String hersteller;
    private boolean laptop;
    private int preis;
    private int mhz;
    
    public Computer(String hersteller, boolean leptop, int preis, int mhz)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(preis);
        setMhz(mhz);
    }
    public Computer(String hersteller, boolean laptop,int preis)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(preis);
        setMhz(2000);
    }
    public Computer(String hersteller,boolean laptop)
    {
        setHersteller(hersteller);
        setLaptop(laptop);
        setPreis(899);
        setMhz(2000);
    }
    public Computer(String hersteller, int preis)
    {
        setHersteller(hersteller);
        setLaptop(true);
        setPreis(preis);
        setMhz(2000);
    }
    public Computer()
    {
        setHersteller("Lenovo");
        setLaptop(true);
        setPreis(899);
        setMhz(2000);
    }
    public void setHersteller(String hersteller)
    {
        if(hersteller!=null){
            this.hersteller=hersteller;
        }else{
            System.out.println("Fehler : ungültige Hersteller");
            this.hersteller="Lenovo";
        }
    }
    public void setLaptop(boolean laptop)
    {
        this.laptop=laptop;
    }
    public void setPreis(int preis)
    {
        if((preis>=600) && (preis<=2000))
        {
        this.preis=preis;
    }else
         {
            System.out.println("Fehler: ungültige Preis");
            this.preis=899;
         }
    }
    public void setMhz(int mhz)
    {
        this.mhz=mhz;
    }
    public String getHersteller()
    {
        return hersteller;
    }
    public boolean getLaptop()
    {
        return laptop;
    }
    public int getPreis()
    {
        return preis;
    }
    public int getMhz()
    {
        return mhz;
    }
    public void printComputer()
    {
        System.out.println( "Hersteller: " + hersteller  + ", Laptop: " + laptop + ", Preis: " + preis + ", mhz: " + mhz );
    }
}
