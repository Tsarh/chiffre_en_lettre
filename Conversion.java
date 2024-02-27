import java.util.Scanner;

public class Conversion
{
    public Conversion()
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("entrer un nombre à convertir");
            int nombre = sc.nextInt();

            if (nombre > -1 && nombre <10)
            {
                unite(nombre);
            }
            else if (nombre>9 && nombre < 100)
            {
                DISENE(nombre);
            }
            else if (nombre>99 && nombre<1000)
            {
                CENTENE(nombre);
            }
            else if (nombre > 999 && nombre < 1000000)
            {
                MILLIEME(nombre);
            }
        }
        catch(Exception e)
        {
            System.out.println("veuillez entrer un nombre :)");
        }
        
    }

    public void MILLIEME(int nombre)
    {
        if(nombre > 999 && nombre < 10000)
        {
            int m = nombre / 1000;
            millieme(m);
            repet(nombre);
        }
        else if( nombre >9999 && nombre < 100000)
        {
            int D = nombre / 10000;
            disene(D);
            int U = (nombre % 10000) / 1000;
            if( U != 0)
            {
                unite(U);
                System.out.print("mille ");
                int r = nombre % 10000;
                repet(r);
            }
        }
        else if( nombre > 99999 && nombre < 1000000)
        {
            int C = nombre / 100000;
            centene(C);
            int cd = (nombre % 100000) / 10000;
            if(cd != 0)
            {
                disene(cd);
            }
            int ud = ((nombre%100000) % 10000) / 1000;
            if(ud != 0)
            {
                unite(ud);
                System.out.print("mille ");
            }
            int reste = (nombre%100000) % 10000;
            repet(reste);
        }
    }

    public void repet(int nombre)
    {
            int c = (nombre % 1000) / 100;
            if(c!=0)
            {
                centene(c);
            }
            // if (nombre > 999 && nombre< 1000)
            int d = ((nombre%1000) % 100) /10;
            if(d != 0)
            {
                disene(d);
            }
            int u = ((nombre%1000) % 100) % 10;
            if(u != 0)
            {
                unite(u);
            }
    }

    public void CENTENE(int nombre)
    {
        if(nombre > 99 && nombre < 1000)
        {
            int c = nombre / 100;
            centene(c);
            int d1 = nombre % 100;
            // System.out.print(d1);
            if ((d1> 10 && d1 < 17) || (d1 > 70 && d1 < 77) || (d1 > 96 && d1 < 100))
            {
                DISENE(d1);
            } 
            else 
            {
                int d = (nombre % 100) / 10;
                disene(d);
                int u = (nombre % 10) % 10;
                unite(u);
            }
        }
    }

    public void DISENE(int nombre)
    {
        switch (nombre)
        {
            case 11:
                System.out.print("onze ");
                break;
            case 12:
                System.out.print("douze ");
                break;
            case 13:
                System.out.print("treize ");
                break;
            case 14:
                System.out.print("quatorze ");
                break;
            case 15:
                System.out.print("quize ");
                break;
            case 16:
                System.out.print("seize ");
                break;
            case 71:
                System.out.print("soicente-onze ");
                break;
            case 72:
                System.out.print("soicente-douze ");
                break;
            case 73:
                System.out.print("soicente-treize ");
                break;
            case 74:
                System.out.print("soicente-quatorze ");
                break;
            case 75:
                System.out.print("soicente-quinze ");
                break;
            case 76:
                System.out.print("soicente-seize ");
                break;
            case 91:
                System.out.print("quatre-vingt onze ");
                break;
            case 92:
                System.out.print("quatre-vingt douze ");
                break;
            case 93:
                System.out.print("quatre-vingt treize ");
                break;
            case 94:
                System.out.print("quatre-vingt quatorze ");
                break;
            case 95:
                System.out.print("quatre-vingt quize ");
                break;
            case 96:
                System.out.print("quatre-vint seize ");
                break;
        }
        if((nombre > 20 && nombre < 91) || (nombre > 96 && nombre < 100))
        {
            int d = nombre / 10;
            disene(d);
            int u = nombre % 10;
            unite(u);
        }
    }

    public void millieme(int nombre)
    {
        if (nombre == 1)
        {
            System.out.print("mille ");
        }
        else if(nombre>1 && nombre<10)
        {
            unite(nombre);
            System.out.print("mille ");
        }
    }

    public void centene(int nombre)
    {
        if (nombre == 1)
        {
            System.out.print("cent ");
        }
        else 
        {
            unite(nombre);
            System.out.print("cent ");
        }
    }

    public void disene(int nombre)
    {
        switch (nombre)
        {
            case 1:
                System.out.print("dix ");
                break;
            case 2:
                System.out.print("vingt ");
                break;
            case 3:
                System.out.print("trente ");
                break;
            case 4:
                System.out.print("quarante ");
                break;
            case 5:
                System.out.print("cinquante ");
                break;
            case 6:
                System.out.print("soicente ");
                break;
            case 7:
                System.out.print("soicente-dix ");
                break;
            case 8:
                System.out.print("quatre-vingt ");
                break;
            case 9:
                System.out.print("quatre-vingt-dix ");
                break;
        }
    }

    public void unite(int nombre)
    {
        switch (nombre)
        {
            case 1:
                System.out.print("un ");
                break;
            case 2:
                System.out.print("deux ");
                break;
            case 3:
                System.out.print("trois ");
                break;
            case 4:
                System.out.print("quatre ");
                break;
            case 5:
                System.out.print("cinq ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("sept ");
                break;
            case 8:
                System.out.print("huit ");
                break;
            case 9:
                System.out.print("neuf ");
                break;
            default:
                System.out.print("zero ");
                break;
        }
    }
}