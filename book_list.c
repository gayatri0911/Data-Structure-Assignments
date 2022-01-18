#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
  int bid;
  char bname[30];
  struct node *next;
}Node;

void create(Node *);
void display(Node *);
void insert(Node *,int,char[30],int);
void del(Node *,int);
int k=0;
int main()
{
   Node *head;
   int ch,id,pos;
   char name[30];
   head=(Node *)malloc(sizeof(Node));
   while(1)
   {
    printf("\n 1.create\n2.Insert\n3.delete from position\n4.display\n5.exit\n");
    printf("\n Enter your choice:");
    scanf("%d",&ch);
    switch(ch)
    {
     case 1:create(head);
            display(head);
            break;
     case 2:printf("\n Enter position:");
            scanf("%d",&pos);
            printf("\n Enter data to be inserted: \n Enter book id:");
            scanf("%d",&id);
            printf("\n Enter book name:");
            scanf("%s",&name);
            if(pos==0)
            printf("\n list starts from position 1\n");
            else
            {
              insert(head,id,name,pos);
              display(head);
            }
              break;
      case 3:printf("\n Enter position:");
             scanf("%d",&pos);
             del(head,pos);
             display(head);
             break;
      case 4:display(head);
             break;
      case 5:exit(0);
             break;
      default:printf("\n Invalid");
     }
    }
}

void create(Node *head)
{
    int n,count;
    Node *temp,*newnode;
    printf("\n How many nodes:");
    scanf("%d",&n);
    temp=head;
    for(count=1;count<=n;count++)
    {
     newnode=(Node *)malloc(sizeof(Node));
     newnode->next=NULL;
     printf("\n Enter the node data:\n Enter book ID:");
     scanf("%d",&newnode->bid);
     printf("\nEnter book name:");
     scanf("%s",&newnode->bname);
     temp->next=newnode;
     temp=newnode;
     k=n;
    }
}

void display(Node *head)
{
    Node *temp;
    for(temp=head->next;temp!=NULL;temp=temp->next)
    {
      printf("%d->",temp->bid);
      printf("%s\t",temp->bname);
    }
}

void insert(Node *head,int id,char name[30],int pos)
{
    Node *new,*temp;
    int i;
    for(temp=head,i=1;(temp!=NULL) && (i<=pos-1);i++)
    {
      temp=temp->next;
      if(temp==NULL)
      {
        printf("\nPosition is out of range");
        return;
      }
    }
    new=(Node *)malloc(sizeof(Node));
    new->bid=id;
    strcpy(new->bname,name);
    new->next=temp->next;
    temp->next=new;
    k++;
}

void del(Node *head,int pos)
{
    Node *temp,*temp1;
    int i;
    if(pos>k)
    {
        printf("\nOut of bound\n");
        return;
    }
    for(temp=head,i=1;(temp->next!=NULL)&&(i<=pos-1);i++)

      temp=temp->next;
      if(temp==NULL)
      {
       printf("\n position is out of range");
       return;
      }

    temp1=temp->next;
    temp->next=temp1->next;
    free(temp1);
    k--;
}
