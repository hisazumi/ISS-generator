#include <stdio.h>

int
main ()
{
  int i, sum=0;
  for (i=0 ; i<10000 ; i++)
    {
      sum += i;
    }
  return 0;
}
