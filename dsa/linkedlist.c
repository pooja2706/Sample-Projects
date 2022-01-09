#include<stdio.h>
#include<stdlib.h>

int pos=0;

void create();
void display();
void deleteAll();

struct node{
    int data;
    struct node *next;
}*head=NULL, *newnode;

void create(){
    if(head!=NULL){
        deleteAll();
    }
    
    struct node *temp=head;
    int num;
    printf("Enter the number of values to insert: ");
    scanf("%d", &num);
    while(num-->0){             //creating LL with number of elements as 'num'
           
        newnode=(struct node *) malloc(sizeof(struct node)); //allocating size
        printf("Enter the element: ");
        scanf("%d", &newnode->data);
        if(head==NULL){                 //when LL is empty, inserting value in 1st node
            head=temp=newnode;
            newnode->next=NULL;
        }
        else{
            temp->next=newnode;
            temp=newnode;
            newnode->next=NULL;
        }
        pos++;
    }
    printf("AFTER CREATING THE LINKED LIST\n");
    display();
}

void insertAtBeg(){
    struct node *temp;
    temp=(struct node *) malloc(sizeof(struct node));

    printf("Enter the number to insert: ");
    scanf("%d", &temp->data);
    pos++;
    if(head==NULL){
        head=newnode=temp;
        temp->next=NULL;
    }
    else{
        temp->next=head;
        head=temp;          //1st node(head) will be temp
    }
    printf("AFTER INSERTING AT BEGINNING\n");
    display();
}

void insertAtEnd(){
    struct node *temp;
    temp=(struct node *) malloc(sizeof(struct node));
    printf("Enter the number to insert: ");
    scanf("%d", &temp->data);
    temp->next=NULL;
    if(head==NULL){
        head=newnode=temp;
    }
    else{
        newnode->next=temp;
        newnode=temp;
    }

    pos++;
    printf("AFTER INSERTING AT END\n");
    display();

}

void insertAtPosition(){
    struct node *temp, *prev=head, *nextnode= NULL;
    temp=(struct node *)malloc(sizeof(struct node));
    int p;

    printf("Enter the value to insert: ");
    scanf("%d", &temp->data);

    printf("Enter the position to insert: ");
    scanf("%d", &p);
    
   
        if(head==NULL){
            head=newnode=temp;
            temp->next=NULL;
            if(p!=1){
                printf("Since no elements are present, the element is inserted in 1st position\n");
            }
        }
        else{
            if(p>pos+1){
            printf("THE LINKED LIST HAS ONLY %d ELEMENTS\n", pos);
            free(temp);
            pos--;
            }
            else if(p<=0){
                printf("PLEASE ENTER A VALID TERM!!\n");
                pos--;
                free(temp);
            }
            else if(p==1){
                temp->next=head;
                head=temp;
            }
            else if(p==pos+1){
                newnode->next=temp;
                newnode=temp;
                temp->next=NULL;
            }
            else{
                for(int i=1; i<p-1; i++){
                    prev=prev->next;
                    nextnode=prev->next;
                }
                prev->next=temp;
                temp->next=nextnode;
            }
        }

        pos++;
    display();


}

void deleteAtBeg(){

    if(head==NULL){
        printf("UNDERFLOW!!");
    }

    else{
        struct node *temp=head;
    head=head->next;
    free(temp);
    pos--;
    }
    display();
}

void deleteAtEnd(){
    
    if(head==NULL){
        printf("UNDERFLOW!!");
    }
    else{
    struct node *temp=head;
    if(head->next==NULL){
        free(head);
        head=newnode=NULL;
    }
    else{
        while(temp->next!=newnode){
            temp=temp->next;
        }
        newnode=temp;
        temp=temp->next;
        free(temp);
        newnode->next=NULL;
    
    }
    pos--;
    }
    display();

}

void deleteAtPosition(){
    int p;
    struct node *temp=head, *ptr;
    if(head==NULL){
        printf("UNDERFLOW!!\n");
    }
    else{
        printf("Enter the position to delete: ");
        scanf("%d", &p);
        if(p>pos){
            printf("THE LINKED LIST HAS ONLY %d ELEMENTS\n", pos);

        }
        else if(p<=0){
            printf("PLEASE ENTER A VALID NUMBER: 1-%d\n", pos);

        }
        else{
            if(p==1){
                temp=head;
                head=head->next;
                free(temp);
            }

            else{
            for(int i=1; i<p-1; i++){
                temp=temp->next;        //i+1 node->previous node of position node
            }
            ptr=temp->next;     //moving to entered position
            temp->next=ptr->next;
            free(ptr);

            if(p==pos){
                newnode=temp;
            }

            }
            pos--;
        }
        
    }
    display();
}

void deleteAll(){
    struct node *temp=head;
    if(head==NULL){
        printf("LINKED LIST IS ALREADY EMPTY!!\n");
    }
    else{
    while(head!=NULL){
        temp=head;
        head=head->next;
        free(temp);
    }
    head=newnode=NULL;
    printf("DELETED THE PREVIOUS LINKED LIST!!\n");
    pos=0;
    }
}

void display(){
    struct node *temp;
    temp=head;

    if(head!=NULL){
    pos==1?printf("THE LINKED LIST WITH %d ELEMENT:\t", pos):printf("THE LINKED LIST WITH %d ELEMENTS:\t", pos);

    while(temp!=NULL){
        printf("%d\t", temp->data);
        temp=temp->next;
    }
    printf("\n");
    }
    else{
        printf("LINKED LIST IS EMPTY\n");
    }

    printf("\n---------------------------------------------------\n");
}

int main(){
    int choice;

    while(1){
        
        printf("1. CREATE LL\n");
        printf("2. INSERT AT BEGINNING\n3. INSERT AT END\n4. INSERT AT A POSITION\n");
        printf("5. DELETE AT BEGINNING\n6. DELETE AT END\n7. DELETE AT A POSITION\n");
        printf("8. DELETE ALL\n9. DISPLAY\n10. EXIT\n");
        printf("Enter a choice:\t");

        scanf("%d", &choice);

        switch(choice){
            case 1: create();
                    break;

            case 2: insertAtBeg();
                    break;

            case 3: insertAtEnd();
                    break;

            case 4: insertAtPosition();
                    break;
                    
            case 5: deleteAtBeg();
                    break;

            case 6: deleteAtEnd();
                    break;

            case 7: deleteAtPosition();
                    break;

            case 8: deleteAll();
                    display();
                    break;

            case 9: display();
                    break;

            case 10: exit(0);

            default:printf("Enter a valid choice!!\n");
        }
    }
    
    return 0;
}